package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ExploreWhatsStreamingRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.PrimeVideoChildAdapter

class PrimeVideoViewHolder(
    private val binding: ExploreWhatsStreamingRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindPrimeVideoRV(item: DataModel.PrimeVideoList) {
        binding.exploreWhatsStreamingRecyclerView.adapter =
            PrimeVideoChildAdapter(binding.root.context).apply {
                submitList(item.primeVideo)
            }

        binding.exploreWhatsStreamingRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
    }
}