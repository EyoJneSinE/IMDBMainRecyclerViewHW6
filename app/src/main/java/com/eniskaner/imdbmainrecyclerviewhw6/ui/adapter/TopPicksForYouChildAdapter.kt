package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TopPicksForYouBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.TopPicksForYouChildViewHolder

class TopPicksForYouChildAdapter(var mContext: Context):
    ListAdapter<DataModel.TopPicksForYou, TopPicksForYouChildViewHolder>(
        TopPicksForYouDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TopPicksForYouChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.top_picks_for_you,
            parent,
            false
        )

        return TopPicksForYouChildViewHolder(TopPicksForYouBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: TopPicksForYouChildViewHolder, position: Int) {
        holder.bindTopPicksForYouChild(
            getItem(position) as DataModel.TopPicksForYou
        )
    }
}