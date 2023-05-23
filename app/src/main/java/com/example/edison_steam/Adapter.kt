package com.example.edison_steam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.edison_steam.room.model.GameModel
import com.example.edison_steam.screens.ListOfGames


class Adapter:RecyclerView.Adapter<Adapter.GameViewHolder>(){
    class GameViewHolder(view: View): RecyclerView.ViewHolder(view){
        var game_title: TextView = itemView.findViewById(R.id.game_title)
        var game_description: TextView = itemView.findViewById(R.id.game_description)
        var game_image: TextView = itemView.findViewById(R.id.game_image)
    }

    var listGames = emptyList<GameModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card,parent,false)
        return GameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listGames.size
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.game_title.text = listGames[position].title
        holder.game_description.text = listGames[position].description
        holder.game_image.text = listGames[position].image
    }

    override fun onViewAttachedToWindow(holder: GameViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.itemView.setOnClickListener{
           // ListOfGames.clickGame(listGames[holder.adapterPosition])
        }
    }


}