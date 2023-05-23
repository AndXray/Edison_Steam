package com.example.edison_steam.room.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


@Entity(tableName = "games_table")
class GameModel (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo
    var title: String ="",

    @ColumnInfo
    var description: String,

    @ColumnInfo
    var image: String

):Serializable