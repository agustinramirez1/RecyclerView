package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.LocationAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycleView()
    }

    private fun initRecycleView() {
        val manager = LinearLayoutManager(this)
        binding.recyclerLocation.layoutManager = manager
        binding.recyclerLocation.adapter =
            LocationAdapter(LocationProvider.locationsList) { locations ->  onItemSelected(locations) }
    }

    fun onItemSelected(location: Locations) {
        Toast.makeText(this, location.nombre, Toast.LENGTH_SHORT).show()
    }
}