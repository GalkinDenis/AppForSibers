package com.denis.appForSibersTeam.viewModels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

//Model of DescribePoke.
class DescribeViewModel @Inject constructor() : ViewModel() {

    private var _avatar: String? = null
    val avatar get() = _avatar

    private var _ability: String? = null
    val ability get() = _ability

    private var _weight: Long? = null
    val weight get() = _weight

    private var _height: Long? = null
    val height get() = _height

    private var _types: String? = null
    val types get() = _types

    private var _hp: Long? = null
    val hp get() = _hp

    private var _attack: Long? = null
    val attack get() = _attack

    private var _defence: Long? = null
    val defence get() = _defence

    private var _speed: Long? = null
    val speed get() = _speed

    //Attach data by poke to ViewModel.
    fun attachUser(
        avatar: String,
        ability: String,
        weight: Long,
        height: Long,
        types: String,
        hp: Long,
        attack: Long,
        defence: Long,
        speed: Long
    ) {
        _avatar = avatar
        _ability = ability
        _weight = weight
        _height = height
        _types = types
        _hp = hp
        _attack = attack
        _defence = defence
        _speed = speed
    }

}