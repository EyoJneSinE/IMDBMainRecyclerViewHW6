package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TheBoxOfficeBinding

class BoxOfficeChildViewHolder(
    private val binding: TheBoxOfficeBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindBoxOfficeChild(item: DataModel.BoxOffice) =
        with(binding) {
            theBoxOfficeId.text = item.boxOfficeId
            theBoxOfficePriceTextView.text = item.boxOfficePrice
            theBoxOfficeTitleTextView.text = item.boxOfficeTitle
        }
}