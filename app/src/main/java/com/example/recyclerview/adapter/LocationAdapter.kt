package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Locations
import com.example.recyclerview.R

class LocationAdapter(private val locationsList : List<Locations>, private val onClickListener: (Locations) -> Unit) : RecyclerView.Adapter<LocationViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LocationViewHolder(layoutInflater.inflate(R.layout.item_locations, parent, false))
    }

    override fun getItemCount(): Int = locationsList.size

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        val item = locationsList[position]
        holder.render(item, onClickListener)
    }
}