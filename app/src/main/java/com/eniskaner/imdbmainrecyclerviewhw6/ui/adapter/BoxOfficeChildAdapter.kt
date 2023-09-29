package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.R
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TheBoxOfficeBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.BoxOfficeChildViewHolder

class BoxOfficeChildAdapter(var mContext: Context):
    ListAdapter<DataModel.BoxOffice, BoxOfficeChildViewHolder>(
        BoxOfficeDiffCallback()
    ) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BoxOfficeChildViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.the_box_office,
            parent,
            false
        )

        return BoxOfficeChildViewHolder(TheBoxOfficeBinding.bind(itemView))
    }

    override fun onBindViewHolder(holder: BoxOfficeChildViewHolder, position: Int) {
        holder.bindBoxOfficeChild(
            getItem(position) as DataModel.BoxOffice
        )
    }
}