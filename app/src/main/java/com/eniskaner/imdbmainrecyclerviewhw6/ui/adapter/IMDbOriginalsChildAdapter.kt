package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ImdbOriginalsBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.IMDbOriginalsChildViewHolder

class IMDbOriginalsChildAdapter(var mContext: Context):
    ListAdapter<DataModel.IMDbOriginals, IMDbOriginalsChildViewHolder>(
        IMDbOriginalsDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IMDbOriginalsChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.imdb_originals,
            parent,
            false
        )

        return IMDbOriginalsChildViewHolder(ImdbOriginalsBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: IMDbOriginalsChildViewHolder, position: Int) {
        holder.bindIMDbOriginalsChild(
            getItem(position) as DataModel.IMDbOriginals
        )
    }
}