package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FollowImdbBinding

class FollowIMDbViewHolder(
    private val binding: FollowImdbBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bindFollowIMDb(item: DataModel.FollowIMDb) =
        with(binding) {
            followIMDBHeadLineTextView.text = item.followImdbHeadline
        }
}