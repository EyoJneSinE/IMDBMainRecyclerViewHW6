package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.InTheatresBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.InTheatresChildViewHolder

class InTheatresChildAdapter(var mContext: Context):
    ListAdapter<DataModel.InTheatres, InTheatresChildViewHolder>(
        InTheatresDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): InTheatresChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.in_theatres,
            parent,
            false
        )

        return InTheatresChildViewHolder(InTheatresBinding.bind(itemView), mContext)
    }

    override fun onBindViewHolder(holder: InTheatresChildViewHolder, position: Int) {
        holder.bindInTheatresChild(
            getItem(position) as DataModel.InTheatres
        )
    }
}