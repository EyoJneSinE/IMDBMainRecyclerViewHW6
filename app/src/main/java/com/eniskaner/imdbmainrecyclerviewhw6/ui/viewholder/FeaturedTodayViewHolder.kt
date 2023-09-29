package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FeaturedTodayHeadlineBinding

class FeaturedTodayViewHolder(
    private val binding: FeaturedTodayHeadlineBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindFeaturedToday(item: DataModel.FeaturedToday) =
        with(binding) {
            featuredTodayTextView.text = item.featuredTodayHeadline
        }
}