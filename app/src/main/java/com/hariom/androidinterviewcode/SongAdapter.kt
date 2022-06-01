package com.hariom.androidinterviewcode

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SongAdapter(val songs:List<Song>) : RecyclerView.Adapter<SongAdapter.MyViewHolder>() {


    // Create view for recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // LayoutInflater converts xml file to java file
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
                                holder.textTitle.text = songs[position].title
                                holder.textDescription.text = songs[position].desciptions
                                var color = "#e075d9"
                                if (position % 2 == 0){
                                    color = "#ddc3f7"
                                }
                    holder.linearLayoutSong.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
         return songs.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var textTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        var textDescription = itemView.findViewById<TextView>(R.id.tvDescription)
        var linearLayoutSong = itemView.findViewById<LinearLayout>(R.id.llSongItemContainer)
    }
}

