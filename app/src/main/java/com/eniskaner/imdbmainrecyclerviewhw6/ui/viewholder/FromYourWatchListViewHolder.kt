package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FromYourWatchListBinding

class FromYourWatchListViewHolder(
    private val binding: FromYourWatchListBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindFromYourWatchList(item: DataModel.FromYourWatchList) =
        with(binding) {
            headLineTextView.text = item.fromYourWatchListHeadline
        }
}