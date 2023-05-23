package com.example.edison_steam.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.edison_steam.APP
import com.example.edison_steam.Adapter
import com.example.edison_steam.R
import com.example.edison_steam.databinding.FragmentListOfGamesBinding
import com.example.edison_steam.room.model.GameModel

class ListOfGames : Fragment() {

    lateinit var binding: FragmentListOfGamesBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter

    private lateinit var viewModel: ListOfGamesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListOfGamesBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init(){
        recyclerView = binding.rvGames
        adapter = Adapter()
        recyclerView.adapter = adapter
    }

    companion object{
        fun clickGame(gameModel: GameModel){
            val bundle = Bundle()
            bundle.putSerializable("game",gameModel)
//            APP.navController.
        }
    }
}