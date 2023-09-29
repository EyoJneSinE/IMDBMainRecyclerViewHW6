package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ComingSoonRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.ComingSoonChildAdapter

class ComingSoonViewHolder(
    private val binding: ComingSoonRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindComingSoonRV(item: DataModel.ComingSoonList) {
        binding.comingSoonRecyclerView.adapter =
            ComingSoonChildAdapter(binding.root.context).apply {
                submitList(item.comingSoon)
            }

        binding.comingSoonRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)
    }
}