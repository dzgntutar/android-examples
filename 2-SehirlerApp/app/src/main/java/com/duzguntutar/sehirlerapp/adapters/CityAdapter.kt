package com.duzguntutar.sehirlerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duzguntutar.sehirlerapp.databinding.RecyclerRowBinding
import com.duzguntutar.sehirlerapp.model.City

class CityAdapter(val cityList:ArrayList<City>): RecyclerView.Adapter<CityAdapter.CityHolder>() {
    class CityHolder(val binding : RecyclerRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  CityHolder(binding)
    }

    override fun onBindViewHolder(holder: CityHolder, position: Int) {
        holder.binding.twCityItem.text = cityList.get(position).name
    }

    override fun getItemCount(): Int {
        return  cityList.size
    }
}