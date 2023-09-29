package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FanFavouritesBinding

class FanFavouritesChildViewHolder(
    private val binding: FanFavouritesBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindFanFavouritesChild(item: DataModel.FanFavourites) =
        with(binding) {
            fanFavouritesAgeLimitTextView.text = item.fanFavouritesAge
            fanFavouritesDurationTimeTextView.text = item.fanFavouritesDuration
            fanFavouritesRatingTextView.text = item.fanFavouritesRating
            fanFavouritesTitleTextView.text = item.fanFavouritesTitle
            fanFavouritesReleaseDateTextView.text = item.fanFavouritesYear
            fanFavouritesImageView.setImageResource(mContext.resources.getIdentifier(item.fanFavouritesPoster, "drawable", mContext.packageName))
        }
}