package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.BornTodayBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.BornTodayChildViewHolder

class BornTodayChildAdapter(var mContext: Context):
    ListAdapter<DataModel.BornToday, BornTodayChildViewHolder>(
        BornTodayDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BornTodayChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.born_today,
            parent,
            false
        )

        return BornTodayChildViewHolder(BornTodayBinding.bind(itemView),mContext)
    }

    override fun onBindViewHolder(holder: BornTodayChildViewHolder, position: Int) {
        holder.bindBornTodayChild(
            getItem(position) as DataModel.BornToday
        )
    }
}