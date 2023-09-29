package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FanFavouritesRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.FanFavouritesChildAdapter

class FanFavouritesViewHolder(
    private val binding: FanFavouritesRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindFanFavouritesRV(item: DataModel.FanFavouritesList) {
        binding.fanfavouritesRecyclerView.adapter =
            FanFavouritesChildAdapter(binding.root.context).apply {
                submitList(item.fanFavourites)
            }

        binding.fanfavouritesRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
    }
}