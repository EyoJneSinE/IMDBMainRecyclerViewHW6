package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.CarouselImageBinding

class ViewPagerChildViewHolder(
    private val binding: CarouselImageBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindViewPagerChild(item: DataModel.ViewPager) =
        with(binding) {
            carouselImageView.setImageResource(mContext.resources.getIdentifier(item.viewPagerHorizontalPoster, "drawable", mContext.packageName))
        }
}