package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ComingSoonBinding

class ComingSoonChildViewHolder(
    private val binding: ComingSoonBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindComingSoonChild(item: DataModel.ComingSoon) =
        with(binding) {
            comingSoonAgeLimitTextView.text = item.comingSoonAge
            comingSoonDurationTimeTextView.text = item.comingSoonDurationTime
            comingSoonRatingTextView.text = item.comingSoonRating
            comingSoonReleaseDateTextView.text = item.comingSoonYear
            comingSoonTitleTextView.text = item.comingSoonTitle
            comingSoonImageView.setImageResource(mContext.resources.getIdentifier(item.comingSoonPoster, "drawable", mContext.packageName))
        }
}