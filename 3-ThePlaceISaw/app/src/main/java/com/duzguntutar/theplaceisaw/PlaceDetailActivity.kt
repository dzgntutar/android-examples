package com.duzguntutar.theplaceisaw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.duzguntutar.theplaceisaw.databinding.ActivityPlaceDetailBinding

class PlaceDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlaceDetailBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlaceDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun imageView_Click(view: View){

    }

    fun btnSave_Click(view: View){

    }
}