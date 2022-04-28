package com.example.modul4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.model.HewanDarat
import com.example.modul4.ui.hewandarat.HewanDaratViewModel
import com.example.modul4.ui.hewandarat.HewandaratFragment

class HewandaratAdapter(
    private val context: Context,
    private val daratArrayList: List<HewanDarat>
): RecyclerView.Adapter<HewandaratAdapter.ItemViewHolder>() {
    private val viewModel = HewanDaratViewModel()


    class ItemViewHolder(val view: View):RecyclerView.ViewHolder(view) {
        val NamaHewantextView: TextView = view.findViewById(R.id.namahewandarat)
        val imagedarat: ImageView = view.findViewById(R.id.gambardarat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder{
        val adapterDaratLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_darat,parent,false)
        return ItemViewHolder(adapterDaratLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = daratArrayList[position]
        holder.NamaHewantextView.text= context?.resources.getString(item.namadarat)
        holder.imagedarat.setImageResource(item.gambardarat)
        holder.view.setOnClickListener {
            Toast.makeText(context, "Anda Menglik item no. ${position+1}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return daratArrayList.size
    }
}