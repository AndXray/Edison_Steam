package com.example.edison_steam.room.repository

import androidx.lifecycle.LiveData
import com.example.edison_steam.room.model.GameModel

interface GameRepository {
    val allGames: LiveData<List<GameModel>>
}