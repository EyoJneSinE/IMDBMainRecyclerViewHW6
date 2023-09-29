package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.WatchFreeOnImdbBinding

class WatchFreeOnIMDbViewHolder(
    private val binding: WatchFreeOnImdbBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindWatchFreeOnIMDb(item: DataModel.WatchFreeOnIMDb) =
        with(binding) {
            watchFreeOnIMDBTextView.text = item.watchFreeOnIMDbHeadline
        }
}