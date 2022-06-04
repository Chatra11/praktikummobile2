package com.example.pahlawan

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pahlawan.ui.PahlawanListAdapter
import com.example.pahlawan.network.Pahlawan

@BindingAdapter("listPahlawan")
fun bindRecyclerView(recyclerView: RecyclerView,data:List<Pahlawan>?){
    val adapter = recyclerView.adapter as PahlawanListAdapter
    adapter.submitList(data)
}