package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ExploreMoviesAndTvShowsBinding

class ExploreMoviesAndTVShowsViewHolder(
    private val binding: ExploreMoviesAndTvShowsBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bindExploreMoviesAndTVShows(item: DataModel.ExploreMoviesAndTVShows) =
        with(binding) {
            exploreMoviesAndTVShowsTextView.text = item.exploreHeadline
        }
}