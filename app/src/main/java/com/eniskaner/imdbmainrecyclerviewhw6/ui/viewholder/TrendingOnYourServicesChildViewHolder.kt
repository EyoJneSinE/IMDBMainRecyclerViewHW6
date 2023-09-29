package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TrendingOnYourServicesBinding

class TrendingOnYourServicesChildViewHolder(
    private val binding: TrendingOnYourServicesBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindTrendingOnYourServicesChild(item: DataModel.TrendingOnYourServices) =
        with(binding) {
            trendingOnYourServicesRatingTextView.text = item.trendingOnYourServicesRating
            trendingOnYourServicesTitleTextView.text = item.trendingOnYourServicesTitle
            trendingOnYourServicesReleaseDateTextView.text = item.trendingOnYourServicesYear
            trendingOnYourServicesEpisodeCountTextView.text = item.trendingOnYourServicesEpisode
            trendingOnYourServicesImageView.setImageResource(mContext.resources.getIdentifier(item.trendingOnYourServicesPoster, "drawable", mContext.packageName))
        }
}