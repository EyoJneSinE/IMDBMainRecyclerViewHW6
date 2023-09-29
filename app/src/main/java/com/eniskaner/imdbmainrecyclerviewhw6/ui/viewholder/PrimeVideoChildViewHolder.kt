package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ExploreWhatsStreamingBinding

class PrimeVideoChildViewHolder(
    private val binding: ExploreWhatsStreamingBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindPrimeVideoChild(item: DataModel.PrimeVideo) =
        with(binding) {
            exploreWhatsStreamingDurationTimeTextView.text = item.primeVideoEpisode
            exploreWhatsStreamingRatingTextView.text = item.primeVideoRating
            exploreWhatsStreamingReleaseDateTextView.text = item.primeVideoYear
            exploreWhatsStreamingTitleTextView.text = item.primeVideoTitle
            exploreWhatsStreamingImageView.setImageResource(mContext.resources.getIdentifier(item.primeVideoPoster, "drawable", mContext.packageName))
        }
}