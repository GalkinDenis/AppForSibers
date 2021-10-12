package com.example.inventory

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.Long
import kotlin.String

public class NavGraphDirections private constructor() {
  private data class ActionPokesListFragmentToDescriberPokeFragment(
    public val avatar: String,
    public val name: String,
    public val ability: String,
    public val weight: Long,
    public val height: Long,
    public val types: String,
    public val hp: Long,
    public val attack: Long,
    public val defence: Long,
    public val speed: Long
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_PokesListFragment_to_DescriberPokeFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("avatar", this.avatar)
      result.putString("name", this.name)
      result.putString("ability", this.ability)
      result.putLong("weight", this.weight)
      result.putLong("height", this.height)
      result.putString("types", this.types)
      result.putLong("hp", this.hp)
      result.putLong("attack", this.attack)
      result.putLong("defence", this.defence)
      result.putLong("speed", this.speed)
      return result
    }
  }

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
    ): NavDirections = ActionPokesListFragmentToDescriberPokeFragment(avatar, name, ability, weight,
        height, types, hp, attack, defence, speed)
  }
}
