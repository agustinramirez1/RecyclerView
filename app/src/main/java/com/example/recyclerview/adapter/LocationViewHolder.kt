package com.example.recyclerview.adapter

import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.Locations
import com.example.recyclerview.databinding.ItemLocationsBinding

class LocationViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemLocationsBinding.bind(view)

    fun render(locationModel: Locations, onClickListener: (Locations) -> Unit) {
        binding.tvnombre.text = locationModel.nombre
        binding.tvhoraInicio.text = locationModel.horaInicio
        binding.tvhoraFin.text = locationModel.horaFin
        binding.tvlocation.text = locationModel.direccion
        itemView.setOnClickListener { onClickListener(locationModel) }
    }
}