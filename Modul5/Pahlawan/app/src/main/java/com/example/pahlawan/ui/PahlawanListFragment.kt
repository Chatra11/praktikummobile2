package com.example.pahlawan.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pahlawan.R
import com.example.pahlawan.databinding.FragmentPahlawanListBinding
import com.google.android.material.divider.MaterialDividerItemDecoration

class PahlawanListFragment : Fragment() {
    private val viewModel: PahlawanViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentPahlawanListBinding.inflate(inflater)
        viewModel.getPahlawanData()
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.recyclerView.adapter = PahlawanListAdapter(PahlawanListener { pahlawan ->
            viewModel.onPahlawanClicked(pahlawan)
            findNavController()
                .navigate(R.id.action_PahlawanListFragment_to_PahlawanDetailFragment)
        })
        (activity as AppCompatActivity).supportActionBar?.title = "Pahlawan Indonesia"
        binding.recyclerView.addItemDecoration(
            MaterialDividerItemDecoration(
                requireContext(),
                LinearLayoutManager.VERTICAL
            )
        )
        return binding.root
    }
}