package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.CarouselImageBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.ViewPagerChildViewHolder

class ViewPagerChildAdapter(var mContext: Context):
    ListAdapter<DataModel.ViewPager, ViewPagerChildViewHolder>(
        ViewPagerDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.carousel_image,
            parent,
            false
        )

        return ViewPagerChildViewHolder(CarouselImageBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: ViewPagerChildViewHolder, position: Int) {
        holder.bindViewPagerChild(
            getItem(position) as DataModel.ViewPager
        )
    }
}