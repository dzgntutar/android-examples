package com.duzguntutar.theplaceisaw

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.duzguntutar.theplaceisaw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var placeList: ArrayList<Place>
    private lateinit var placeAdapter: PlaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        placeList = ArrayList<Place>()
        placeAdapter = PlaceAdapter(placeList)
        binding.rvPlaceList.layoutManager = LinearLayoutManager(this)
        binding.rvPlaceList.adapter = placeAdapter

        try {

            val database = this.openOrCreateDatabase("MyDb", Context.MODE_PRIVATE, null)

            val cursor = database.rawQuery("SELECT * FROM Places", null)
            val placeNameIx = cursor.getColumnIndex("name")
            val idIx = cursor.getColumnIndex("id")

            while (cursor.moveToNext()) {
                val name = cursor.getString(placeNameIx)
                val id = cursor.getInt(idIx)
                val place = Place(name, id)
                placeList.add(place)
            }

            placeAdapter.notifyDataSetChanged()

            cursor.close()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Inflater
        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.place_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.add_place_item) {
            val intent = Intent(this, PlaceDetailActivity::class.java)
            intent.putExtra("info", "new")
            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }
}