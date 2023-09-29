package com.eniskaner.imdbmainrecyclerviewhw6.data.repo

import com.eniskaner.imdbmainrecyclerviewhw6.data.datasource.IMDbDataSource
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel

class IMDbRepository(private var ids: IMDbDataSource) {


    suspend fun add(): MutableList<DataModel.ViewPagerList> = ids.add()

    suspend fun addFeaturedToday(): MutableList<DataModel.FeaturedToday> = ids.addFeaturedToday()

    suspend fun addFeaturedTodayPictures(): MutableList<DataModel.FeaturedTodayPicturesList> = ids.addFeaturedTodayPictures()

    suspend fun addWhatToWatch(): MutableList<DataModel.WhatToWatch> = ids.addWhatToWatch()

    suspend fun addTrendingOnYourServices(): MutableList<DataModel.TrendingOnYourServicesList> = ids.addTrendingOnYourServices()

    suspend fun addFromYourWatchList(): MutableList<DataModel.FromYourWatchList> = ids.addFromYourWatchList()

    suspend fun addTopPicksForYou(): MutableList<DataModel.TopPicksForYouList> = ids.addTopPicksForYou()

    suspend fun addFanFavourites(): MutableList<DataModel.FanFavouritesList> = ids.addFanFavourites()

    suspend fun addWatchFreeOnIMDb(): MutableList<DataModel.WatchFreeOnIMDb> = ids.addWatchFreeOnIMDb()

    suspend fun addIMDbOriginals(): MutableList<DataModel.IMDbOriginalsList> = ids.addIMDbOriginals()

    suspend fun addExploreWhatsStreaming(): MutableList<DataModel.ExploreWhatsStreaming> = ids.addExploreWhatsStreaming()

    suspend fun addPrimeVideo(): MutableList<DataModel.PrimeVideoList> = ids.addPrimeVideo()

    suspend fun addExploreMoviesAndTVShows(): MutableList<DataModel.ExploreMoviesAndTVShows> = ids.addExploreMoviesAndTVShows()

    suspend fun addInTheatres(): MutableList<DataModel.InTheatresList> = ids.addInTheatres()

    suspend fun addBoxOffice(): MutableList<DataModel.BoxOfficeList> = ids.addBoxOffice()

    suspend fun addComingSoon(): MutableList<DataModel.ComingSoonList> = ids.addComingSoon()

    suspend fun addBornToday(): MutableList<DataModel.BornTodayList> = ids.addBornToday()

    suspend fun addTopNews(): MutableList<DataModel.TopNews> = ids.addTopNews()

    suspend fun addFollowIMDb(): MutableList<DataModel.FollowIMDb> = ids.addFollowIMDb()
}