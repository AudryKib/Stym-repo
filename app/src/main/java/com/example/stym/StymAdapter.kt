package com.example.stym

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import models.Stym

class StymAdapter(private val stymList: Array<Stym> ): RecyclerView.Adapter<StymAdapter.ProjectViewHolder>() {

//lateinit var binding: StymLibraryItemsBinding

     class ProjectViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         val icon: ImageView = itemView.findViewById(R.id.image_view_stym_icon)
         val textViewName : TextView = itemView.findViewById(R.id.text_view_title)
         val textViewDescription : TextView = itemView.findViewById(R.id.text_view_description)
         val textViewDate : TextView = itemView.findViewById(R.id.text_view_date)
         val textViewTracks : TextView = itemView.findViewById(R.id.text_view_tracks)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
     val view=LayoutInflater.from(parent.context).inflate(R.layout.stym_library_items, parent, false)
        return ProjectViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
           val currentStym = stymList[position]
            holder.icon.setImageResource(currentStym.artWork)
            holder.textViewName.text = currentStym.name
            holder.textViewDescription.text = currentStym.Description
            holder.textViewDate.text = currentStym.creationDate
            holder.textViewTracks.text = currentStym.numberOfTracks.toString()
    }

    override fun getItemCount() = stymList.size
}