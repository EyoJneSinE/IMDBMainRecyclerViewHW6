package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ImdbOriginalsBinding

class IMDbOriginalsChildViewHolder(
    private val binding: ImdbOriginalsBinding,
    private var mContext: Context
) : RecyclerView.ViewHolder(binding.root) {

    fun bindIMDbOriginalsChild(item: DataModel.IMDbOriginals) =
        with(binding) {
            imdbOriginalsImageView.setImageResource(mContext.resources.getIdentifier(item.imdbOriginalsPoster, "drawable", mContext.packageName))
            imdbOriginalsTextView.text = item.imdbOriginalsContents
        }
}