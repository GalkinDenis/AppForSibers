package com.denis.appForSibersTeam.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Pokes")
data class Pokes(

    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "avatar")
    val avatar: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "ability")
    val ability: String,

    @ColumnInfo(name = "weight")
    val weight: Long,

    @ColumnInfo(name = "height")
    val height: Long,

    @ColumnInfo(name = "types")
    val types: String,

    @ColumnInfo(name = "hp")
    val hp: Long,

    @ColumnInfo(name = "attack")
    val attack: Long,

    @ColumnInfo(name = "defence")
    val defence: Long,

    @ColumnInfo(name = "speed")
    val speed: Long

)
