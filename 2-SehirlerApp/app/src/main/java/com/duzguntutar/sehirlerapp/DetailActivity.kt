package com.duzguntutar.sehirlerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duzguntutar.sehirlerapp.databinding.ActivityDetailBinding
import com.duzguntutar.sehirlerapp.model.City

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedCity = intent.getSerializableExtra("city") as City

        binding.tvName.text = selectedCity.name
        binding.tvPopulation.text = selectedCity.population.toString()
        binding.ivCity.setImageResource(selectedCity.image)

    }
}