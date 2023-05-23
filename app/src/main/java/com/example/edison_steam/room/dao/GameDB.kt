package com.example.edison_steam.room.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.edison_steam.room.model.GameModel

@Database(entities = [GameModel::class], version = 0)
abstract class GameDB:RoomDatabase() {

    abstract fun getGameDao(): DaoGame

    companion object{
        private var database: GameDB ?= null

        @Synchronized
        fun getInst(context: Context): GameDB{
            return if (database == null){
                database = Room.databaseBuilder(context,GameDB::class.java,"db").build()
                database as GameDB
            }
            else database as GameDB
        }
    }

}