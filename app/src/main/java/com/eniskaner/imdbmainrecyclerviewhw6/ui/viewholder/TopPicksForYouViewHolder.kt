package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TopPicksForYouRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.TopPicksForYouChildAdapter

class TopPicksForYouViewHolder(
    private val binding: TopPicksForYouRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindTopPicksForYouRV(item: DataModel.TopPicksForYouList) {
        binding.fanfavouritesRecyclerView.adapter =
            TopPicksForYouChildAdapter(binding.root.context).apply {
                submitList(item.topPicksForYou)
            }

        binding.fanfavouritesRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
    }
}