package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TopNewsBinding

class TopNewsViewHolder(
    private val binding: TopNewsBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindTopNews(item: DataModel.TopNews) =
        with(binding) {
            topNewsContentsTextView.text = item.topNewsContents
            topNewsTitleTextView.text = item.topNewsHeadline
            topNewsImageView.setImageResource(mContext.resources.getIdentifier(item.topNewsPoster, "drawable", mContext.packageName))
        }
}