package com.denis.appForSibersTeam.pokesListFragment

import androidx.navigation.NavDirections
import com.example.inventory.NavGraphDirections
import kotlin.Long
import kotlin.String

public class PokesListFragmentDirections private constructor() {
  public companion object {
    public fun actionPokesListFragmentToDescriberPokeFragment(
      avatar: String,
      name: String,
      ability: String,
      weight: Long,
      height: Long,
      types: String,
      hp: Long,
      attack: Long,
      defence: Long,
      speed: Long
    ): NavDirections = NavGraphDirections.actionPokesListFragmentToDescriberPokeFragment(avatar,
        name, ability, weight, height, types, hp, attack, defence, speed)
  }
}
