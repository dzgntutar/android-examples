package com.duzguntutar.theplaceisaw

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.duzguntutar.theplaceisaw.databinding.RecyclerRowBinding


class PlaceAdapter(private val placeList: ArrayList<Place>) :
    RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {
    
    class PlaceHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlaceHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        holder.binding.recyclerViewTextView.text = placeList.get(position).name
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, PlaceDetailActivity::class.java)
            intent.putExtra("info", "old")
            intent.putExtra("id", placeList[position].id)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        println("size " + placeList.size)
        return placeList.size
    }

}