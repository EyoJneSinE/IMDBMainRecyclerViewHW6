package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_BORN_TODAY
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_BORN_TODAY_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_BOX_OFFICE
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_BOX_OFFICE_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_COMING_SOON
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_COMING_SOON_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_EXPLORE_MOVIES_AND_TV_SHOWS
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_EXPLORE_WHATS_STREAMING
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FAN_FAVOURITES
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FAN_FAVOURITES_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FEATURED_TODAY
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FEATURED_TODAY_PICTURES
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FEATURED_TODAY_PICTURES_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FOLLOW_IMDB
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_FROM_YOUR_WATCHLIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_IMDB_ORIGINALS
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_IMDB_ORIGINALS_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_IN_THEATRES
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_IN_THEATRES_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_PRIME_VIDEO
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_PRIME_VIDEO_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_TOP_NEWS
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_TOP_PICKS_FOR_YOU
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_TOP_PICKS_FOR_YOU_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_TRENDING_ON_YOUR_SERVICES
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_TRENDING_ON_YOUR_SERVICES_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_VIEWPAGER
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_VIEWPAGER_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_WATCH_FREE_ON_IMDB
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_WHAT_TO_WATCH
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.BornTodayRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.CarouselViewPagerBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ComingSoonRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ExploreMoviesAndTvShowsBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ExploreWhatsStreamingRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FanFavouritesRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FeaturedTodayHeadlineBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FeaturedTodayRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FollowImdbBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.FromYourWatchListBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ImdbOriginalsRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.InTheatresRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TheBoxOfficeListBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TopNewsBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TopPicksForYouRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.TrendingOnYourServicesRecyclerViewBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.WatchFreeOnImdbBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.WhatToWatchBinding
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.WhatsStreamingBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.BornTodayViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.BoxOfficeViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.ComingSoonViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.ExploreMoviesAndTVShowsViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.ExploreWhatsStreamingViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FanFavouritesViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FeaturedTodayPicturesViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FeaturedTodayViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FollowIMDbViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.FromYourWatchListViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.IMDbOriginalsViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.InTheatresViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.PrimeVideoViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.TopNewsViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.TopPicksForYouViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.TrendingOnYourServicesViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.ViewPagerViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.WatchFreeOnIMDbViewHolder
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewholder.WhatToWatchViewHolder

class MainAdapter :
    ListAdapter<DataModel, RecyclerView.ViewHolder>(DataModelDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_VIEWPAGER_LIST -> {
                val viewPagerBinding =
                    CarouselViewPagerBinding.inflate(layoutInflater, parent, false)
                ViewPagerViewHolder(viewPagerBinding)
            }

            TYPE_FEATURED_TODAY -> {
                val featuredTodayBinding =
                    FeaturedTodayHeadlineBinding.inflate(layoutInflater, parent, false)
                FeaturedTodayViewHolder(featuredTodayBinding)
            }

            TYPE_FEATURED_TODAY_PICTURES_LIST -> {
                val featuredTodayPicturesBinding =
                    FeaturedTodayRecyclerViewBinding.inflate(layoutInflater, parent, false)
                FeaturedTodayPicturesViewHolder(featuredTodayPicturesBinding)
            }

            TYPE_WHAT_TO_WATCH -> {
                val whatToWatchBinding =
                    WhatToWatchBinding.inflate(layoutInflater, parent, false)
                WhatToWatchViewHolder(whatToWatchBinding)
            }

            TYPE_TRENDING_ON_YOUR_SERVICES_LIST -> {
                val trendingOnYourServicesBinding =
                    TrendingOnYourServicesRecyclerViewBinding.inflate(layoutInflater, parent, false)
                TrendingOnYourServicesViewHolder(trendingOnYourServicesBinding)
            }

            TYPE_FROM_YOUR_WATCHLIST -> {
                val fromYourWatchListBinding =
                    FromYourWatchListBinding.inflate(layoutInflater, parent, false)
                FromYourWatchListViewHolder(fromYourWatchListBinding)
            }

            TYPE_TOP_PICKS_FOR_YOU_LIST -> {
                val topPicksForYouBinding =
                    TopPicksForYouRecyclerViewBinding.inflate(layoutInflater, parent, false)
                TopPicksForYouViewHolder(topPicksForYouBinding)
            }

            TYPE_FAN_FAVOURITES_LIST -> {
                val fanFavouritesBinding =
                    FanFavouritesRecyclerViewBinding.inflate(layoutInflater, parent, false)
                FanFavouritesViewHolder(fanFavouritesBinding)
            }

            TYPE_WATCH_FREE_ON_IMDB -> {
                val watchFreeOnIMDbBinding =
                    WatchFreeOnImdbBinding.inflate(layoutInflater, parent, false)
                WatchFreeOnIMDbViewHolder(watchFreeOnIMDbBinding)
            }

            TYPE_IMDB_ORIGINALS_LIST -> {
                val imdbOriginalsBinding =
                    ImdbOriginalsRecyclerViewBinding.inflate(layoutInflater, parent, false)
                IMDbOriginalsViewHolder(imdbOriginalsBinding)
            }

            TYPE_EXPLORE_WHATS_STREAMING -> {
                val exploreWhatStreamingBinding =
                    WhatsStreamingBinding.inflate(layoutInflater, parent, false)
                ExploreWhatsStreamingViewHolder(exploreWhatStreamingBinding)
            }

            TYPE_PRIME_VIDEO_LIST -> {
                val primeVideoBinding =
                    ExploreWhatsStreamingRecyclerViewBinding.inflate(layoutInflater, parent, false)
                PrimeVideoViewHolder(primeVideoBinding)
            }

            TYPE_EXPLORE_MOVIES_AND_TV_SHOWS -> {
                val exploreMoviesAndTVShowsBinding =
                    ExploreMoviesAndTvShowsBinding.inflate(layoutInflater, parent, false)
                ExploreMoviesAndTVShowsViewHolder(exploreMoviesAndTVShowsBinding)
            }

            TYPE_IN_THEATRES_LIST -> {
                val inTheatresBinding =
                    InTheatresRecyclerViewBinding.inflate(layoutInflater, parent, false)
                InTheatresViewHolder(inTheatresBinding)
            }

            TYPE_BOX_OFFICE_LIST -> {
                val boxOfficeBinding =
                    TheBoxOfficeListBinding.inflate(layoutInflater, parent, false)
                BoxOfficeViewHolder(boxOfficeBinding)
            }

            TYPE_COMING_SOON_LIST -> {
                val comingSoonBinding =
                    ComingSoonRecyclerViewBinding.inflate(layoutInflater, parent, false)
                ComingSoonViewHolder(comingSoonBinding)
            }

            TYPE_BORN_TODAY_LIST -> {
                val bornTodayBinding =
                    BornTodayRecyclerViewBinding.inflate(layoutInflater, parent, false)
                BornTodayViewHolder(bornTodayBinding)
            }

            TYPE_TOP_NEWS -> {
                val topNewsBinding =
                    TopNewsBinding.inflate(layoutInflater, parent, false)
                TopNewsViewHolder(topNewsBinding,parent.context)
            }

            TYPE_FOLLOW_IMDB -> {
                val followImdbBinding =
                    FollowImdbBinding.inflate(layoutInflater, parent, false)
                FollowIMDbViewHolder(followImdbBinding)
            }

            TYPE_VIEWPAGER -> {
                val viewPagerBinding =
                    CarouselViewPagerBinding.inflate(layoutInflater, parent, false)
                ViewPagerViewHolder(viewPagerBinding)
            }

            TYPE_FEATURED_TODAY_PICTURES -> {
                val featuredTodayPicturesBinding =
                    FeaturedTodayRecyclerViewBinding.inflate(layoutInflater, parent, false)
                FeaturedTodayPicturesViewHolder(featuredTodayPicturesBinding)
            }

            TYPE_TRENDING_ON_YOUR_SERVICES -> {
                val trendingOnYourServicesBinding =
                    TrendingOnYourServicesRecyclerViewBinding.inflate(layoutInflater, parent, false)
                TrendingOnYourServicesViewHolder(trendingOnYourServicesBinding)
            }

            TYPE_TOP_PICKS_FOR_YOU -> {
                val topPicksForYouBinding =
                    TopPicksForYouRecyclerViewBinding.inflate(layoutInflater, parent, false)
                TopPicksForYouViewHolder(topPicksForYouBinding)
            }

            TYPE_FAN_FAVOURITES -> {
                val fanFavouritesBinding =
                    FanFavouritesRecyclerViewBinding.inflate(layoutInflater, parent, false)
                FanFavouritesViewHolder(fanFavouritesBinding)
            }

            TYPE_IMDB_ORIGINALS -> {
                val imdbOriginalsBinding =
                    ImdbOriginalsRecyclerViewBinding.inflate(layoutInflater, parent, false)
                IMDbOriginalsViewHolder(imdbOriginalsBinding)
            }

            TYPE_PRIME_VIDEO -> {
                val primeVideoBinding =
                    ExploreWhatsStreamingRecyclerViewBinding.inflate(layoutInflater, parent, false)
                PrimeVideoViewHolder(primeVideoBinding)
            }

            TYPE_IN_THEATRES -> {
                val inTheatresBinding =
                    InTheatresRecyclerViewBinding.inflate(layoutInflater, parent, false)
                InTheatresViewHolder(inTheatresBinding)
            }

            TYPE_BOX_OFFICE -> {
                val boxOfficeBinding =
                    TheBoxOfficeListBinding.inflate(layoutInflater, parent, false)
                BoxOfficeViewHolder(boxOfficeBinding)
            }

            TYPE_BORN_TODAY -> {
                val bornTodayBinding =
                    BornTodayRecyclerViewBinding.inflate(layoutInflater, parent, false)
                BornTodayViewHolder(bornTodayBinding)
            }
            else -> throw IllegalArgumentException("Invalid Type: $viewType")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        when (item.type()) {
            TYPE_VIEWPAGER_LIST -> {
                val viewPagerViewHolder = holder as ViewPagerViewHolder
                viewPagerViewHolder.bindViewPagerRV(
                    item as DataModel.ViewPagerList
                )
            }
            TYPE_FEATURED_TODAY -> {
                val featuredTodayViewHolder = holder as FeaturedTodayViewHolder

                featuredTodayViewHolder.bindFeaturedToday(
                    item as DataModel.FeaturedToday
                )
            }
            TYPE_FEATURED_TODAY_PICTURES_LIST -> {
                val featuredTodayPicturesViewHolder = holder as FeaturedTodayPicturesViewHolder
                featuredTodayPicturesViewHolder.bindFeaturedTodayPicturesRV(
                    item as DataModel.FeaturedTodayPicturesList
                )
            }

            TYPE_WHAT_TO_WATCH -> {
                val whatToWatchViewHolder = holder as WhatToWatchViewHolder

                whatToWatchViewHolder.bindWhatToWatch(
                    item as DataModel.WhatToWatch
                )
            }

            TYPE_TRENDING_ON_YOUR_SERVICES_LIST -> {
                val trendingOnYourServicesHolder = holder as TrendingOnYourServicesViewHolder
                trendingOnYourServicesHolder.bindTrendingOnYourServicesRV(
                    item as DataModel.TrendingOnYourServicesList
                )
            }

            TYPE_FROM_YOUR_WATCHLIST -> {
                val fromYourWatchListViewHolder = holder as FromYourWatchListViewHolder
                fromYourWatchListViewHolder.bindFromYourWatchList(
                    item as DataModel.FromYourWatchList
                )
            }

            TYPE_TOP_PICKS_FOR_YOU_LIST -> {
                val topPicksForYouHolder = holder as TopPicksForYouViewHolder
                topPicksForYouHolder.bindTopPicksForYouRV(
                    item as DataModel.TopPicksForYouList
                )
            }

            TYPE_FAN_FAVOURITES_LIST -> {
                val fanFavouritesViewHolder = holder as FanFavouritesViewHolder

                fanFavouritesViewHolder.bindFanFavouritesRV(
                    item as DataModel.FanFavouritesList
                )
            }

            TYPE_WATCH_FREE_ON_IMDB -> {
                val watchFreeOnIMDbHolder = holder as WatchFreeOnIMDbViewHolder
                watchFreeOnIMDbHolder.bindWatchFreeOnIMDb(
                    item as DataModel.WatchFreeOnIMDb
                )
            }

            TYPE_IMDB_ORIGINALS_LIST -> {
                val imdbOriginalsViewHolder = holder as IMDbOriginalsViewHolder
                imdbOriginalsViewHolder.bindIMDbOriginalsRV(
                    item as DataModel.IMDbOriginalsList
                )
            }

            TYPE_EXPLORE_WHATS_STREAMING -> {
                val exploreWhatsStreamingViewHolder = holder as ExploreWhatsStreamingViewHolder
                exploreWhatsStreamingViewHolder.bindExploreWhatsStreaming(
                    item as DataModel.ExploreWhatsStreaming
                )
            }

            TYPE_PRIME_VIDEO_LIST -> {
                val primeVideoViewHolder = holder as PrimeVideoViewHolder
                primeVideoViewHolder.bindPrimeVideoRV(
                    item as DataModel.PrimeVideoList
                )
            }

            TYPE_EXPLORE_MOVIES_AND_TV_SHOWS -> {
                val exploreMoviesAndTVShowsViewHolder = holder as ExploreMoviesAndTVShowsViewHolder
                exploreMoviesAndTVShowsViewHolder.bindExploreMoviesAndTVShows(
                    item as DataModel.ExploreMoviesAndTVShows
                )
            }

            TYPE_IN_THEATRES_LIST -> {
                val inTheatresViewHolder = holder as InTheatresViewHolder
                inTheatresViewHolder.bindInTheatresRV(
                    item as DataModel.InTheatresList
                )
            }

            TYPE_BOX_OFFICE_LIST -> {
                val theBoxOfficeViewHolder = holder as BoxOfficeViewHolder
                theBoxOfficeViewHolder.bindBoxOfficeRV(
                    item as DataModel.BoxOfficeList
                )
            }

            TYPE_COMING_SOON_LIST -> {
                val comingSoonViewHolder = holder as ComingSoonViewHolder
                comingSoonViewHolder.bindComingSoonRV(
                    item as DataModel.ComingSoonList
                )
            }

            TYPE_BORN_TODAY_LIST -> {
                val bornTodayViewHolder = holder as BornTodayViewHolder
                bornTodayViewHolder.bindBornTodayRV(
                    item as DataModel.BornTodayList
                )
            }

            TYPE_TOP_NEWS -> {
                val topNewsViewHolder = holder as TopNewsViewHolder
                topNewsViewHolder.bindTopNews(
                    item as DataModel.TopNews
                )
            }

            TYPE_FOLLOW_IMDB -> {
                val followIMDbViewHolder = holder as FollowIMDbViewHolder
                followIMDbViewHolder.bindFollowIMDb(
                    item as DataModel.FollowIMDb
                )
            }

            TYPE_VIEWPAGER -> {
                val viewPagerViewHolder = holder as ViewPagerViewHolder
                viewPagerViewHolder.bindViewPagerRV(
                    item as DataModel.ViewPagerList
                )
            }

            TYPE_FEATURED_TODAY_PICTURES -> {
                val featuredTodayPicturesViewHolder = holder as FeaturedTodayPicturesViewHolder
                featuredTodayPicturesViewHolder.bindFeaturedTodayPicturesRV(
                    item as DataModel.FeaturedTodayPicturesList
                )
            }

            TYPE_TRENDING_ON_YOUR_SERVICES -> {
                val trendingOnYourServicesHolder = holder as TrendingOnYourServicesViewHolder
                trendingOnYourServicesHolder.bindTrendingOnYourServicesRV(
                    item as DataModel.TrendingOnYourServicesList
                )
            }

            TYPE_TOP_PICKS_FOR_YOU -> {
                val topPicksForYouHolder = holder as TopPicksForYouViewHolder
                topPicksForYouHolder.bindTopPicksForYouRV(
                    item as DataModel.TopPicksForYouList
                )
            }

            TYPE_FAN_FAVOURITES -> {
                val fanFavouritesViewHolder = holder as FanFavouritesViewHolder

                fanFavouritesViewHolder.bindFanFavouritesRV(
                    item as DataModel.FanFavouritesList
                )
            }

            TYPE_IMDB_ORIGINALS -> {
                val imdbOriginalsViewHolder = holder as IMDbOriginalsViewHolder
                imdbOriginalsViewHolder.bindIMDbOriginalsRV(
                    item as DataModel.IMDbOriginalsList
                )
            }

            TYPE_PRIME_VIDEO -> {
                val primeVideoViewHolder = holder as PrimeVideoViewHolder
                primeVideoViewHolder.bindPrimeVideoRV(
                    item as DataModel.PrimeVideoList
                )
            }

            TYPE_IN_THEATRES -> {
                val inTheatresViewHolder = holder as InTheatresViewHolder
                inTheatresViewHolder.bindInTheatresRV(
                    item as DataModel.InTheatresList
                )
            }

            TYPE_BOX_OFFICE -> {
                val theBoxOfficeViewHolder = holder as BoxOfficeViewHolder
                theBoxOfficeViewHolder.bindBoxOfficeRV(
                    item as DataModel.BoxOfficeList
                )
            }

            TYPE_COMING_SOON -> {
                val comingSoonViewHolder = holder as ComingSoonViewHolder

                comingSoonViewHolder.bindComingSoonRV(
                    item as DataModel.ComingSoonList
                )
            }

            TYPE_BORN_TODAY -> {
                val bornTodayViewHolder = holder as BornTodayViewHolder
                bornTodayViewHolder.bindBornTodayRV(
                    item as DataModel.BornTodayList
                )
            }
        }
    }

    override fun getItemViewType(position: Int) = getItem(position).type()

}