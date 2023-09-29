package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.InTheatresBinding

class InTheatresChildViewHolder(
    private val binding: InTheatresBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindInTheatresChild(item: DataModel.InTheatres) =
        with(binding) {
            inTheatresAgeLimitTextView.text = item.inTheatresAge
            inTheatresDurationTimeTextView.text = item.inTheatresDuration
            inTheatresRatingTextView.text = item.inTheatresRating
            inTheatresReleaseDateTextView.text = item.inTheatresYear
            inTheatresTitleTextView.text = item.inTheatresTitle
            inTheatresImageView.setImageResource(mContext.resources.getIdentifier(item.inTheatresPoster, "drawable", mContext.packageName))
        }
}