package com.example.edison_steam.room.repository

import androidx.lifecycle.LiveData
import com.example.edison_steam.room.dao.DaoGame
import com.example.edison_steam.room.model.GameModel

class GameRealisation(private val daoGame: DaoGame): GameRepository {
    override val allGames: LiveData<List<GameModel>>
        get() = daoGame.getGames()

}