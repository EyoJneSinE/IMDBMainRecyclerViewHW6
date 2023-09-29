package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ComingSoonBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.ComingSoonChildViewHolder

class ComingSoonChildAdapter(var mContext: Context):
    ListAdapter<DataModel.ComingSoon, ComingSoonChildViewHolder>(
        ComingSoonDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComingSoonChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.coming_soon,
            parent,
            false
        )

        return ComingSoonChildViewHolder(ComingSoonBinding.bind(itemView),mContext)
    }

    override fun onBindViewHolder(holder: ComingSoonChildViewHolder, position: Int) {
        holder.bindComingSoonChild(
            getItem(position) as DataModel.ComingSoon
        )
    }
}