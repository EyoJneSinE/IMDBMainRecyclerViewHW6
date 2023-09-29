package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FanFavouritesBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FanFavouritesChildViewHolder

class FanFavouritesChildAdapter(var mContext: Context):
    ListAdapter<DataModel.FanFavourites, FanFavouritesChildViewHolder>(
        FanFavouritesDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FanFavouritesChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.fan_favourites,
            parent,
            false
        )

        return FanFavouritesChildViewHolder(FanFavouritesBinding.bind(itemView),mContext)
    }

    override fun onBindViewHolder(holder: FanFavouritesChildViewHolder, position: Int) {
        holder.bindFanFavouritesChild(
            getItem(position) as DataModel.FanFavourites
        )
    }
}