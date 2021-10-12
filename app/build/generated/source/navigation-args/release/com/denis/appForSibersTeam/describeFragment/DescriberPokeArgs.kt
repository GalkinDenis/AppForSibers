package com.denis.appForSibersTeam.describeFragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Long
import kotlin.String
import kotlin.jvm.JvmStatic

public data class DescriberPokeArgs(
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
) : NavArgs {
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DescriberPokeArgs {
      bundle.setClassLoader(DescriberPokeArgs::class.java.classLoader)
      val __avatar : String?
      if (bundle.containsKey("avatar")) {
        __avatar = bundle.getString("avatar")
        if (__avatar == null) {
          throw IllegalArgumentException("Argument \"avatar\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"avatar\" is missing and does not have an android:defaultValue")
      }
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue")
      }
      val __ability : String?
      if (bundle.containsKey("ability")) {
        __ability = bundle.getString("ability")
        if (__ability == null) {
          throw IllegalArgumentException("Argument \"ability\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"ability\" is missing and does not have an android:defaultValue")
      }
      val __weight : Long
      if (bundle.containsKey("weight")) {
        __weight = bundle.getLong("weight")
      } else {
        throw IllegalArgumentException("Required argument \"weight\" is missing and does not have an android:defaultValue")
      }
      val __height : Long
      if (bundle.containsKey("height")) {
        __height = bundle.getLong("height")
      } else {
        throw IllegalArgumentException("Required argument \"height\" is missing and does not have an android:defaultValue")
      }
      val __types : String?
      if (bundle.containsKey("types")) {
        __types = bundle.getString("types")
        if (__types == null) {
          throw IllegalArgumentException("Argument \"types\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"types\" is missing and does not have an android:defaultValue")
      }
      val __hp : Long
      if (bundle.containsKey("hp")) {
        __hp = bundle.getLong("hp")
      } else {
        throw IllegalArgumentException("Required argument \"hp\" is missing and does not have an android:defaultValue")
      }
      val __attack : Long
      if (bundle.containsKey("attack")) {
        __attack = bundle.getLong("attack")
      } else {
        throw IllegalArgumentException("Required argument \"attack\" is missing and does not have an android:defaultValue")
      }
      val __defence : Long
      if (bundle.containsKey("defence")) {
        __defence = bundle.getLong("defence")
      } else {
        throw IllegalArgumentException("Required argument \"defence\" is missing and does not have an android:defaultValue")
      }
      val __speed : Long
      if (bundle.containsKey("speed")) {
        __speed = bundle.getLong("speed")
      } else {
        throw IllegalArgumentException("Required argument \"speed\" is missing and does not have an android:defaultValue")
      }
      return DescriberPokeArgs(__avatar, __name, __ability, __weight, __height, __types, __hp,
          __attack, __defence, __speed)
    }
  }
}
