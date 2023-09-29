package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FeaturedTodayBinding

class FeaturedTodayPicturesChildViewHolder(
    private val binding: FeaturedTodayBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindFeaturedTodayPicturesChild(item: DataModel.FeaturedTodayPictures) =
        with(binding) {
            featuredTitleTextView.text = item.featuredTodayPicturesTitle
            featuredTodayImageView.setImageResource(mContext.resources.getIdentifier(item.featuredTodayPictures1, "drawable", mContext.packageName))
            featuredTodayImageView2.setImageResource(mContext.resources.getIdentifier(item.featuredTodayPictures2, "drawable", mContext.packageName))
            featuredTodayImageView3.setImageResource(mContext.resources.getIdentifier(item.featuredTodayPictures3, "drawable", mContext.packageName))
        }
}