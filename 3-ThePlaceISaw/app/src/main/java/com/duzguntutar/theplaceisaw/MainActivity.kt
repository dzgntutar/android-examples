package com.duzguntutar.theplaceisaw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.duzguntutar.theplaceisaw.databinding.ActivityMainBinding
import com.duzguntutar.theplaceisaw.databinding.ActivityPlaceDetailBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.place_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.add_place_item) {
            val intent = Intent(this, PlaceDetailActivity::class.java)

            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }
}