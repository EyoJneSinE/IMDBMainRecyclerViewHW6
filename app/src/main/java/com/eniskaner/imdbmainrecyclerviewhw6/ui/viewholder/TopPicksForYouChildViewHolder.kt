package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TopPicksForYouBinding

class TopPicksForYouChildViewHolder(
    private val binding: TopPicksForYouBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindTopPicksForYouChild(item: DataModel.TopPicksForYou) =
        with(binding) {
            topPicksRatingTextView.text = item.topPicksForYouRating
            topPicksTitleTextView.text = item.topPicksForYouTitle
            topPicksReleaseDateTextView.text = item.topPicksForYouYear
            topPicksDurationTimeTextView.text = item.topPicksForYouDuration
            topPicksImageView.setImageResource(mContext.resources.getIdentifier(item.topPicksForYouPoster, "drawable", mContext.packageName))
        }
}