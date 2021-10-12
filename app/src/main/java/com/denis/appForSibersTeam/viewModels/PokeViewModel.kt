package com.denis.appForSibersTeam.viewModels

import android.widget.CheckBox
import androidx.lifecycle.*
import com.denis.appForSibersTeam.data.ItemDao
import com.denis.appForSibersTeam.data.Pokes
import com.denis.appForSibersTeam.forJsonParse.PokeDeserialization
import com.denis.appForSibersTeam.network.Repository
import com.denis.appForSibersTeam.pokesListFragment.PokesListFragment
import kotlinx.coroutines.launch
import javax.inject.Inject

// Enum of the states of the network request.
enum class PokeApiStatus { DONE, ERROR, AWAITING }

//Model of PokeList.
class PokeViewModel @Inject constructor(
    @Volatile private var dao: ItemDao,
    private val repository: Repository
) : ViewModel() {


    //Return flag of return from DescribeFragment.
    var flag = false

    //Saving position state for net request.
    private var position = 1

    //var for sort functions.
    private var sumOfIndicators: Long = 0

    //Check box state.
    var hp: Boolean = false
    var attack: Boolean = false
    var defence: Boolean = false

    private val listOfPokes = mutableListOf<String>()

    //Saving list state after return from DescribeFragment.
    private var savedList: List<Pokes>? = null

    //Updating pokes list.
    private val allPokeFromDB: LiveData<List<Pokes>> = repository.getAllItems(dao)
    private var allPokeToPokeList = MutableLiveData<List<Pokes>>()

    //Network error listener.
    private var _networkResponse = MutableLiveData<PokeApiStatus>()
    val networkResponse get() = _networkResponse

    //Listener of updating pokes list.
    fun getAllPoke(
        userListFragment: PokesListFragment,
        switchHp: CheckBox,
        switchAttack: CheckBox,
        switchDefence: CheckBox
    ): LiveData<List<Pokes>> {
        allPokeFromDB.observe(userListFragment.viewLifecycleOwner, Observer {
            if(flag && !savedList.isNullOrEmpty()) {
                allPokeToPokeList.value = savedList!!
            } else{
                switchHp.isChecked = false
                switchAttack.isChecked = false
                switchDefence.isChecked = false

                allPokeToPokeList.value = it
                savedList = it
           }
        })
        return allPokeToPokeList
    }

    //Main sorted function = 1, 2, 3.
    fun sortedAllPoke() {
        when {
            ((hp && !attack && !defence) || (!hp && attack && !defence) || (!hp && !attack && defence)) -> sortedIfSelectOneOfAll()
            (!hp && !attack && !defence) -> {
                //3
                savedList = allPokeFromDB.value
                allPokeToPokeList.value = savedList!!
            }
            else -> sortedIfSelectMoreThanOne()
        }
    }

    //1.
    private fun sortedIfSelectOneOfAll() {
        when {
            hp -> {
                savedList = allPokeFromDB.value?.sortedByDescending { list -> list.hp }!!
                allPokeToPokeList.value = savedList!!
            }

            attack -> {
                savedList = allPokeFromDB.value?.sortedByDescending { list -> list.attack }!!
                allPokeToPokeList.value = savedList!!
            }

            defence -> {
                savedList = allPokeFromDB.value?.sortedByDescending { list -> list.defence }!!
                allPokeToPokeList.value = savedList!!
            }
        }
    }

    //2.
    private fun sortedIfSelectMoreThanOne() {
        savedList = allPokeFromDB.value?.sortedByDescending { list ->
            if(hp)  {
                sumOfIndicators += list.hp
            }
            if(attack) {
                sumOfIndicators += list.attack
            }
            if(defence) {
                sumOfIndicators += list.defence
            }
            sumOfIndicators
        }
        allPokeToPokeList.value = savedList!!
    }

    //Reinitializing of poke list on random position from server.
    fun shufflePokeList() {
        viewModelScope.launch {
            position = (1..1118).random()
            savedList = null
            repository.clearTable(dao)
            fillingOfList()
        }
    }

    //Filling DB.
    //Заполнение таблицы базы данных.
    fun fillingOfList() {
        flag = false

        viewModelScope.launch {
            for(i in position..(position + 29)) {
                try {
                    //Request for JSON.
                        val responseFromJSONRequest = repository.getJsonResponse(i)
                    //If request is positive, perform filling DB.
                    responseFromJSONRequest.body()?.let { response ->
                        _networkResponse.value = PokeApiStatus.DONE
                        if (!listOfPokes.contains(response.name)) {
                            repository.insertToDatabase(dao, createTableItem(response))
                        }
                        listOfPokes.add(response.name)
                    }
                //Else update status of error.
                } catch (e: Exception) {
                    println("$e ddddddddddddddddddddddddddddddddddddddddddddddddddd")
                    _networkResponse.value = PokeApiStatus.ERROR
                    _networkResponse.value = PokeApiStatus.AWAITING
                }
            }
            position += 29
        }
    }

    //Preparing table item.
    private fun createTableItem(poke: PokeDeserialization): Pokes {

        var abilities = ""
        var types = ""

        poke.abilities.forEach { _poke ->
            abilities += "${_poke.ability.name}\n"
        }

        poke.types.forEach { _poke ->
            types += "${_poke.type.name}\n"
        }
        return Pokes (
            id = 0,
            avatar = poke.sprites.front_default,
            name = poke.name,
            ability = abilities,
            weight = poke.weight,
            height = poke.height,
            types = types,
            hp = poke.stats[0].base_stat,
            attack = poke.stats[1].base_stat,
            defence = poke.stats[2].base_stat,
            speed = poke.stats[5].base_stat
        )
    }

}



