package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TrendingOnYourServicesRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.TrendingOnYourServicesChildAdapter

class TrendingOnYourServicesViewHolder(
    private val binding: TrendingOnYourServicesRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindTrendingOnYourServicesRV(item: DataModel.TrendingOnYourServicesList) {
        binding.topNewsImageView.adapter =
            TrendingOnYourServicesChildAdapter(binding.root.context).apply {
                submitList(item.trendingOnYourServices)
            }

        binding.topNewsImageView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
    }
}