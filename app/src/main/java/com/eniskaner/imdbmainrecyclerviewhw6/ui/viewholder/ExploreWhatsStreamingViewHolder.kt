package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.WhatsStreamingBinding

class ExploreWhatsStreamingViewHolder(
    private val binding: WhatsStreamingBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindExploreWhatsStreaming(item: DataModel.ExploreWhatsStreaming) =
        with(binding) {
            whatsStreamingTextView.text = item.streamingHeadline
        }
}