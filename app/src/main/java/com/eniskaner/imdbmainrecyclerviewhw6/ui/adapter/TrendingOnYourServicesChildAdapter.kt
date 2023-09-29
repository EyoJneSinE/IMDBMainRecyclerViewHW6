package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TrendingOnYourServicesBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.TrendingOnYourServicesChildViewHolder

class TrendingOnYourServicesChildAdapter(var mContext: Context):
    ListAdapter<DataModel.TrendingOnYourServices, TrendingOnYourServicesChildViewHolder>(
        TrendingOnYourServicesDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TrendingOnYourServicesChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.trending_on_your_services,
            parent,
            false
        )

        return TrendingOnYourServicesChildViewHolder(TrendingOnYourServicesBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: TrendingOnYourServicesChildViewHolder, position: Int) {
        holder.bindTrendingOnYourServicesChild(
            getItem(position) as DataModel.TrendingOnYourServices
        )
    }
}