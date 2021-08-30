package com.duzguntutar.sehirlerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.duzguntutar.sehirlerapp.adapters.CityAdapter
import com.duzguntutar.sehirlerapp.databinding.ActivityDetailBinding
import com.duzguntutar.sehirlerapp.databinding.ActivityMainBinding
import com.duzguntutar.sehirlerapp.model.City

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var cityList : ArrayList<City>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        cityList = ArrayList<City>()

        val elazig = City("Elazığ",450000,R.drawable.elazig)
        val tunceli = City("Tunceli",35000,R.drawable.tunceli)
        val izmir = City("izmir",4000000,R.drawable.izmir)

        cityList.add(elazig)
        cityList.add(tunceli)
        cityList.add(izmir)

        binding.rwCity.layoutManager = LinearLayoutManager(this)
        var adapter = CityAdapter(cityList)
        binding.rwCity.adapter = adapter
    }
}