package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ImdbOriginalsRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.IMDbOriginalsChildAdapter

class IMDbOriginalsViewHolder(
    private val binding: ImdbOriginalsRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindIMDbOriginalsRV(item: DataModel.IMDbOriginalsList) {

        binding.imdbOriginalsRecyclerView.adapter =
            IMDbOriginalsChildAdapter(binding.root.context).apply {
                submitList(item.imdbOriginals)
            }

        binding.imdbOriginalsRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
    }
}