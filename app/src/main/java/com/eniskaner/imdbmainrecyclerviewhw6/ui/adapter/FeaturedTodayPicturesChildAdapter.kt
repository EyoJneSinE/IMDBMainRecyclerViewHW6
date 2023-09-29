package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FeaturedTodayBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FeaturedTodayPicturesChildViewHolder

class FeaturedTodayPicturesChildAdapter(var mContext: Context):
    ListAdapter<DataModel.FeaturedTodayPictures, FeaturedTodayPicturesChildViewHolder>(
        FeaturedTodayPicturesDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FeaturedTodayPicturesChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.featured_today,
            parent,
            false
        )

        return FeaturedTodayPicturesChildViewHolder(FeaturedTodayBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: FeaturedTodayPicturesChildViewHolder, position: Int) {
        holder.bindFeaturedTodayPicturesChild(
            getItem(position) as DataModel.FeaturedTodayPictures
        )
    }
}