package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.BornTodayRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.BornTodayChildAdapter

class BornTodayViewHolder(
    private val binding: BornTodayRecyclerViewBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindBornTodayRV(item: DataModel.BornTodayList) {
        binding.bornTodayRecyclerView.adapter =
            BornTodayChildAdapter(binding.root.context).apply {
                submitList(item.bornToday)
            }

        binding.bornTodayRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.HORIZONTAL, false)

    }
}