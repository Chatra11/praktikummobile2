package com.example.modul4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.model.HewanAir
import com.example.modul4.ui.hewanair.HewanairFragment

class HewanairAdapter(
    private val context: HewanairFragment,
    private val airArrayList: ArrayList<HewanAir>
):RecyclerView.Adapter<HewanairAdapter.ItemViewHolder>() {
    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val namaHewanAirtextView: TextView = view.findViewById(R.id.namahewanair)
        val gambarhewanAir: ImageView = view.findViewById(R.id.gambarair)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val hewanairAdapterlayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_air,parent,false)
        return ItemViewHolder(hewanairAdapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = airArrayList[position]
        holder.namaHewanAirtextView.text = item.namaAir
        holder.gambarhewanAir.setImageResource(item.gambarAir)
    }

    override fun getItemCount(): Int {
        return airArrayList.size
    }

}