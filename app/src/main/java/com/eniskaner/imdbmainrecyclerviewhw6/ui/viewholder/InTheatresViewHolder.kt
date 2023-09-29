package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.InTheatresRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.InTheatresChildAdapter

class InTheatresViewHolder(
    private val binding: InTheatresRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindInTheatresRV(item: DataModel.InTheatresList) {

        binding.inTheatresRecyclerView.adapter =
            InTheatresChildAdapter(binding.root.context).apply {
                submitList(item.inTheatres)
            }

        binding.inTheatresRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)

    }
}