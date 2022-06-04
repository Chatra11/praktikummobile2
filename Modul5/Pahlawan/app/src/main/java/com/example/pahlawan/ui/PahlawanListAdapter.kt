package com.example.pahlawan.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.pahlawan.databinding.ListPahlawanBinding
import com.example.pahlawan.network.Pahlawan

class PahlawanListAdapter (private val clickListener: PahlawanListener):
    ListAdapter<Pahlawan, PahlawanListAdapter.PahlawanViewHolder>(DiffCallback)
{
    class PahlawanViewHolder(
        var binding: ListPahlawanBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun bind(clickListener: PahlawanListener?, pahlawan: Pahlawan){
            binding.pahlawan = pahlawan
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }
    }
    companion object DiffCallback : DiffUtil.ItemCallback<Pahlawan>(){
        override fun areItemsTheSame(oldItem: Pahlawan, newItem: Pahlawan): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: Pahlawan, newItem: Pahlawan): Boolean {
            return oldItem.description == newItem.description
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : PahlawanViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PahlawanViewHolder(
            ListPahlawanBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PahlawanViewHolder, position: Int){
        val pahlawan = getItem(position)
        holder.bind(clickListener, pahlawan)
    }
}
class PahlawanListener(val clickListener: (pahlawan:Pahlawan ) -> Unit){
    fun onClick(pahlawan: Pahlawan) = clickListener(pahlawan)
}