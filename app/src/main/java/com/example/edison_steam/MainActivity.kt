package com.example.edison_steam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edison_steam.databinding.ActivityMainBinding
import com.example.edison_steam.room.dao.GameDB

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}