package com.example.modul4.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.model.HewanUdara
import com.example.modul4.ui.hewanudara.HewanudaraFragment
import com.example.modul4.ui.hewanudara.HewanudaraViewModel
import com.google.android.material.internal.ContextUtils.getActivity


class HewanudaraAdapter(
    private val context: HewanudaraFragment,
    private val udaraArrayList: List<HewanUdara>
): RecyclerView.Adapter<HewanudaraAdapter.ItemViewHolder>() {
    private val viewModel = HewanudaraViewModel()
    private lateinit var mylistener : onItemClickListener
    interface onItemClickListener{
        fun onItemclick(position: Int)
    }
    fun setOnClickListener(listener: onItemClickListener){
        mylistener = listener
    }


    class ItemViewHolder(val view: View, listener: onItemClickListener): RecyclerView.ViewHolder(view) {
        val NamaHewantextView: TextView = view.findViewById(R.id.namahewanudara)
        val imageudara: ImageView = view.findViewById(R.id.gambarudara)

        init {
            itemView.setOnClickListener{
                listener.onItemclick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder{
        val adapterUdaraLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_udara,parent,false)
        return ItemViewHolder(adapterUdaraLayout,mylistener)
    }
    override fun getItemCount(): Int {
        return udaraArrayList.size
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int){
        val item = udaraArrayList[position]
        holder.NamaHewantextView.text = item.namaudara
        holder.imageudara.setImageResource(item.gambarudara)
//        holder.view.setOnClickListener {
//                val view: View
//                Toast.makeText(view.getContext() ,"kamu mengklik item no. $position", Toast.LENGTH_SHORT).show()
//        }
    }

}

