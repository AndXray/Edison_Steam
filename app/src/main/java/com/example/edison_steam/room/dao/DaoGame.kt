package com.example.edison_steam.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.edison_steam.room.model.GameModel


@Dao
interface DaoGame {

    @Query("SELECT * from games_table")
    fun getGames(): LiveData<List<GameModel>>
}