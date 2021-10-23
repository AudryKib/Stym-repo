package com.example.stym

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import models.Stym

class StymAdapter(private val context: Context, private val stymList: List<Stym> ): RecyclerView.Adapter<StymAdapter.ProjectViewHolder>() {

//lateinit var binding: StymLibraryItemsBinding

     class ProjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val icon: ImageView = itemView.findViewById(R.id.image_view_stym_icon)
         val textViewName : TextView = itemView.findViewById(R.id.text_view_title)
         val textViewDescription : TextView = itemView.findViewById(R.id.text_view_description)
         val textViewDate : TextView = itemView.findViewById(R.id.text_view_date)
         val textViewTracks : TextView = itemView.findViewById(R.id.text_view_tracks)

         fun bind(stym: Stym){
             textViewName.text = stym.name
             textViewDescription.text = stym.description
             textViewDate.text = stym.creationDate
             textViewTracks.text = stym.numberOfTracks.toString()

         }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
     val view=LayoutInflater.from(context).inflate(R.layout.stym_library_items, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bind(stymList[position])
    }
            //holder.icon.setImageResource(currentStym.artWork)

    override fun getItemCount() = stymList.size
}