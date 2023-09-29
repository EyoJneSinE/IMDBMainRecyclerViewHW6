package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.BornTodayBinding

class BornTodayChildViewHolder(
    private val binding: BornTodayBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindBornTodayChild(item: DataModel.BornToday) =
        with(binding) {
            bornTodayAgeTextView.text = item.bornTodayAge
            bornTodayNameTextView.text = item.bornTodayName
            binding.bornTodayImageView.setImageResource(mContext.resources.getIdentifier(item.bornTodayPoster, "drawable", mContext.packageName))
        }
}