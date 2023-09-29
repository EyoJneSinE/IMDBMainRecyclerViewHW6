package com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter

import androidx.recyclerview.widget.DiffUtil
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel

class DataModelDiffCallback :
        DiffUtil.ItemCallback<DataModel>() {
    override fun areItemsTheSame(oldItem: DataModel, newItem: DataModel): Boolean {
        return when {
            (oldItem is DataModel.ViewPagerList && newItem is DataModel.ViewPagerList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ViewPagerList && newItem is DataModel.ViewPagerList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.FeaturedToday && newItem is DataModel.FeaturedToday) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.FeaturedTodayPicturesList && newItem is DataModel.FeaturedTodayPicturesList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.WhatToWatch && newItem is DataModel.WhatToWatch) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.TrendingOnYourServicesList && newItem is DataModel.TrendingOnYourServicesList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.FromYourWatchList && newItem is DataModel.FromYourWatchList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.TopPicksForYouList && newItem is DataModel.TopPicksForYouList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.FanFavouritesList && newItem is DataModel.FanFavouritesList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.WatchFreeOnIMDb && newItem is DataModel.WatchFreeOnIMDb) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.IMDbOriginalsList && newItem is DataModel.IMDbOriginalsList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ExploreWhatsStreaming && newItem is DataModel.ExploreWhatsStreaming) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.PrimeVideoList && newItem is DataModel.PrimeVideoList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ExploreMoviesAndTVShows && newItem is DataModel.ExploreMoviesAndTVShows) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.InTheatresList && newItem is DataModel.InTheatresList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.BoxOfficeList && newItem is DataModel.BoxOfficeList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ComingSoonList && newItem is DataModel.ComingSoonList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.BornTodayList && newItem is DataModel.BornTodayList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.TopNews && newItem is DataModel.TopNews) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.FollowIMDb && newItem is DataModel.FollowIMDb) -> {
                oldItem == newItem
            }
            /*(oldItem is DataModel.ViewPagerList && newItem is DataModel.ViewPagerList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ViewPagerList && newItem is DataModel.ViewPagerList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ViewPagerList && newItem is DataModel.ViewPagerList) -> {
                oldItem == newItem
            }
            (oldItem is DataModel.ViewPagerList && newItem is DataModel.ViewPagerList) -> {
                oldItem == newItem
            }*/
            else -> false
        }
    }

    override fun areContentsTheSame(oldItem: DataModel, newItem: DataModel) = oldItem == newItem

}

class BornTodayDiffCallback :
    DiffUtil.ItemCallback<DataModel.BornToday>() {
    override fun areItemsTheSame(
        oldItem: DataModel.BornToday,
        newItem: DataModel.BornToday
    ) = oldItem.bornTodayName == newItem.bornTodayName ||
            oldItem.bornTodayAge == newItem.bornTodayAge ||
            oldItem.bornTodayPoster == newItem.bornTodayPoster

    override fun areContentsTheSame(
        oldItem: DataModel.BornToday,
        newItem: DataModel.BornToday
    ) = oldItem == newItem

}

class BoxOfficeDiffCallback :
    DiffUtil.ItemCallback<DataModel.BoxOffice>() {
    override fun areItemsTheSame(
        oldItem: DataModel.BoxOffice,
        newItem: DataModel.BoxOffice
    ) = oldItem.boxOfficeId == newItem.boxOfficeId ||
            oldItem.boxOfficePrice == newItem.boxOfficePrice ||
            oldItem.boxOfficeTitle == newItem.boxOfficeTitle

    override fun areContentsTheSame(
        oldItem: DataModel.BoxOffice,
        newItem: DataModel.BoxOffice
    ) = oldItem == newItem

}

class ComingSoonDiffCallback :
    DiffUtil.ItemCallback<DataModel.ComingSoon>() {
    override fun areItemsTheSame(
        oldItem: DataModel.ComingSoon,
        newItem: DataModel.ComingSoon
    ) = oldItem.comingSoonAge == newItem.comingSoonAge ||
            oldItem.comingSoonPoster == newItem.comingSoonPoster ||
            oldItem.comingSoonRating == newItem.comingSoonRating ||
            oldItem.comingSoonTitle == newItem.comingSoonTitle ||
            oldItem.comingSoonDurationTime == newItem.comingSoonDurationTime ||
            oldItem.comingSoonYear == newItem.comingSoonYear

    override fun areContentsTheSame(
        oldItem: DataModel.ComingSoon,
        newItem: DataModel.ComingSoon
    ) = oldItem == newItem

}

class FanFavouritesDiffCallback :
    DiffUtil.ItemCallback<DataModel.FanFavourites>() {
    override fun areItemsTheSame(
        oldItem: DataModel.FanFavourites,
        newItem: DataModel.FanFavourites
    ) = oldItem.fanFavouritesAge == newItem.fanFavouritesAge ||
            oldItem.fanFavouritesPoster == newItem.fanFavouritesPoster ||
            oldItem.fanFavouritesDuration == newItem.fanFavouritesDuration ||
            oldItem.fanFavouritesTitle == newItem.fanFavouritesTitle ||
            oldItem.fanFavouritesRating == newItem.fanFavouritesRating ||
            oldItem.fanFavouritesYear == newItem.fanFavouritesYear

    override fun areContentsTheSame(
        oldItem: DataModel.FanFavourites,
        newItem: DataModel.FanFavourites
    ) = oldItem == newItem

}

class FeaturedTodayPicturesDiffCallback :
    DiffUtil.ItemCallback<DataModel.FeaturedTodayPictures>() {
    override fun areItemsTheSame(
        oldItem: DataModel.FeaturedTodayPictures,
        newItem: DataModel.FeaturedTodayPictures
    ) = oldItem.featuredTodayPictures1 == newItem.featuredTodayPictures1 ||
            oldItem.featuredTodayPictures2 == newItem.featuredTodayPictures2 ||
            oldItem.featuredTodayPictures3 == newItem.featuredTodayPictures3 ||
            oldItem.featuredTodayPicturesTitle == newItem.featuredTodayPicturesTitle

    override fun areContentsTheSame(
        oldItem: DataModel.FeaturedTodayPictures,
        newItem: DataModel.FeaturedTodayPictures
    ) = oldItem == newItem

}

class IMDbOriginalsDiffCallback :
    DiffUtil.ItemCallback<DataModel.IMDbOriginals>() {
    override fun areItemsTheSame(
        oldItem: DataModel.IMDbOriginals,
        newItem: DataModel.IMDbOriginals
    ) = oldItem.imdbOriginalsContents == newItem.imdbOriginalsContents ||
            oldItem.imdbOriginalsPoster == newItem.imdbOriginalsPoster

    override fun areContentsTheSame(
        oldItem: DataModel.IMDbOriginals,
        newItem: DataModel.IMDbOriginals
    ) = oldItem == newItem

}

class InTheatresDiffCallback :
    DiffUtil.ItemCallback<DataModel.InTheatres>() {
    override fun areItemsTheSame(
        oldItem: DataModel.InTheatres,
        newItem: DataModel.InTheatres
    ) = oldItem.inTheatresAge == newItem.inTheatresAge ||
            oldItem.inTheatresPoster == newItem.inTheatresPoster ||
            oldItem.inTheatresRating == newItem.inTheatresRating ||
            oldItem.inTheatresTitle == newItem.inTheatresTitle ||
            oldItem.inTheatresDuration == newItem.inTheatresDuration ||
            oldItem.inTheatresYear == newItem.inTheatresYear

    override fun areContentsTheSame(
        oldItem: DataModel.InTheatres,
        newItem: DataModel.InTheatres
    ) = oldItem == newItem

}

class PrimeVideoDiffCallback :
    DiffUtil.ItemCallback<DataModel.PrimeVideo>() {
    override fun areItemsTheSame(
        oldItem: DataModel.PrimeVideo,
        newItem: DataModel.PrimeVideo
    ) = oldItem.primeVideoEpisode == newItem.primeVideoEpisode ||
            oldItem.primeVideoPoster == newItem.primeVideoPoster ||
            oldItem.primeVideoRating == newItem.primeVideoRating ||
            oldItem.primeVideoTitle == newItem.primeVideoTitle ||
            oldItem.primeVideoYear == newItem.primeVideoYear

    override fun areContentsTheSame(
        oldItem: DataModel.PrimeVideo,
        newItem: DataModel.PrimeVideo
    ) = oldItem == newItem

}

class TopPicksForYouDiffCallback :
    DiffUtil.ItemCallback<DataModel.TopPicksForYou>() {
    override fun areItemsTheSame(
        oldItem: DataModel.TopPicksForYou,
        newItem: DataModel.TopPicksForYou
    ) = oldItem.topPicksForYouDuration == newItem.topPicksForYouDuration ||
            oldItem.topPicksForYouPoster == newItem.topPicksForYouPoster ||
            oldItem.topPicksForYouRating == newItem.topPicksForYouRating ||
            oldItem.topPicksForYouTitle == newItem.topPicksForYouTitle ||
            oldItem.topPicksForYouYear == newItem.topPicksForYouYear

    override fun areContentsTheSame(
        oldItem: DataModel.TopPicksForYou,
        newItem: DataModel.TopPicksForYou
    ) = oldItem == newItem

}

class TrendingOnYourServicesDiffCallback :
    DiffUtil.ItemCallback<DataModel.TrendingOnYourServices>() {
    override fun areItemsTheSame(
        oldItem: DataModel.TrendingOnYourServices,
        newItem: DataModel.TrendingOnYourServices
    ) = oldItem.trendingOnYourServicesEpisode == newItem.trendingOnYourServicesEpisode ||
            oldItem.trendingOnYourServicesPoster == newItem.trendingOnYourServicesPoster ||
            oldItem.trendingOnYourServicesRating == newItem.trendingOnYourServicesRating ||
            oldItem.trendingOnYourServicesTitle == newItem.trendingOnYourServicesTitle ||
            oldItem.trendingOnYourServicesYear == newItem.trendingOnYourServicesYear

    override fun areContentsTheSame(
        oldItem: DataModel.TrendingOnYourServices,
        newItem: DataModel.TrendingOnYourServices
    ) = oldItem == newItem

}

class ViewPagerDiffCallback :
    DiffUtil.ItemCallback<DataModel.ViewPager>() {
    override fun areItemsTheSame(
        oldItem: DataModel.ViewPager,
        newItem: DataModel.ViewPager
    ) = oldItem.viewPagerContents == newItem.viewPagerContents ||
            oldItem.viewPagerHeadline == newItem.viewPagerHeadline ||
            oldItem.viewPagerHorizontalPoster == newItem.viewPagerHorizontalPoster ||
            oldItem.viewPagerVerticalPoster == newItem.viewPagerVerticalPoster

    override fun areContentsTheSame(
        oldItem: DataModel.ViewPager,
        newItem: DataModel.ViewPager
    ) = oldItem == newItem

}