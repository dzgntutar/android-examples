package com.duzguntutar.theplaceisaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duzguntutar.theplaceisaw.databinding.ActivityMainBinding
import com.duzguntutar.theplaceisaw.databinding.ActivityPlaceDetailBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }
}