package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FeaturedTodayRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.FeaturedTodayPicturesChildAdapter

class FeaturedTodayPicturesViewHolder(
    private val binding: FeaturedTodayRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindFeaturedTodayPicturesRV(item: DataModel.FeaturedTodayPicturesList) {

        binding.featuredRecyclerView.adapter =
            FeaturedTodayPicturesChildAdapter(binding.root.context).apply {
                submitList(item.featuredTodayPictures)
            }

        binding.featuredRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)

    }
}