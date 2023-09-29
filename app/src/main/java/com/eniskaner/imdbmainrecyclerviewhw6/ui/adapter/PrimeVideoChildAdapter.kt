package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ExploreWhatsStreamingBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.PrimeVideoChildViewHolder

class PrimeVideoChildAdapter(var mContext: Context):
    ListAdapter<DataModel.PrimeVideo, PrimeVideoChildViewHolder>(
        PrimeVideoDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PrimeVideoChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.explore_whats_streaming,
            parent,
            false
        )

        return PrimeVideoChildViewHolder(ExploreWhatsStreamingBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: PrimeVideoChildViewHolder, position: Int) {
        holder.bindPrimeVideoChild(
            getItem(position) as DataModel.PrimeVideo
        )
    }
}