package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TheBoxOfficeListBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.BoxOfficeChildAdapter

class BoxOfficeViewHolder(
    private val binding: TheBoxOfficeListBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindBoxOfficeRV(item: DataModel.BoxOfficeList) {
        binding.theBoxOfficeRecyclerView.adapter =
            BoxOfficeChildAdapter(binding.root.context).apply {
                submitList(item.boxOffice)
            }

        binding.theBoxOfficeRecyclerView.layoutManager =
            LinearLayoutManager(binding.root.context, LinearLayoutManager.VERTICAL, false)
    }
}