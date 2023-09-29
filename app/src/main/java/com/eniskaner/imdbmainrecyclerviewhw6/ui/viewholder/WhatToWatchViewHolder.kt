package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.WhatToWatchBinding

class WhatToWatchViewHolder(
    private val binding: WhatToWatchBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindWhatToWatch(item: DataModel.WhatToWatch) =
        with(binding) {
            whatToWatchTextView.text = item.whatToWatchHeadline
        }
}