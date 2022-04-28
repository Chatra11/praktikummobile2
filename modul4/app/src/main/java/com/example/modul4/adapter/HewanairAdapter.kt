package com.example.modul4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.model.HewanAir
import com.example.modul4.ui.hewanair.HewanairFragment

class HewanairAdapter(
    private val context: Context,
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
        holder.namaHewanAirtextView.text = context?.resources.getString(item.namaAir)
        holder.gambarhewanAir.setImageResource(item.gambarAir)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Anda Mengklik item no. ${position+1}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return airArrayList.size
    }

}