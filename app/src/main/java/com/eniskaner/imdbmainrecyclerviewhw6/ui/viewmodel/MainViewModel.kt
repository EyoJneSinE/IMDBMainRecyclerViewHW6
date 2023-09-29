package com.eniskaner.imdbmainrecyclerviewhw6.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.data.repo.IMDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (
    private var iRepo: IMDbRepository
): ViewModel() {

    var list = mutableListOf<DataModel.ViewPagerList>()
    var listFeaturedToday = mutableListOf<DataModel.FeaturedToday>()
    var listFeaturedTodayPicture = mutableListOf<DataModel.FeaturedTodayPicturesList>()
    var listWhatToWatch = mutableListOf<DataModel.WhatToWatch>()
    var listTrendingOnYourServices = mutableListOf<DataModel.TrendingOnYourServicesList>()
    var listFromYourWatchList = mutableListOf<DataModel.FromYourWatchList>()
    var listTopPicksForYou = mutableListOf<DataModel.TopPicksForYouList>()
    var listFanFavouritesList = mutableListOf<DataModel.FanFavouritesList>()
    var listWatchFreeOnIMDb = mutableListOf<DataModel.WatchFreeOnIMDb>()
    var listIMDbOriginals = mutableListOf<DataModel.IMDbOriginalsList>()
    var listExploreWhatsStreaming = mutableListOf<DataModel.ExploreWhatsStreaming>()
    var listPrimeVideo = mutableListOf<DataModel.PrimeVideoList>()
    var listExploreMoviesAndTVShows = mutableListOf<DataModel.ExploreMoviesAndTVShows>()
    var listInTheatres = mutableListOf<DataModel.InTheatresList>()
    var listBoxOffice = mutableListOf<DataModel.BoxOfficeList>()
    var listComingSoon = mutableListOf<DataModel.ComingSoonList>()
    var listBornToday = mutableListOf<DataModel.BornTodayList>()
    var listTopNews = mutableListOf<DataModel.TopNews>()
    var listFollowIMDb = mutableListOf<DataModel.FollowIMDb>()

    init {
        add()
        addFeaturedToday()
        featuredTodayPictures()
        addWhatToWatch()
        addTrendingOnYourServices()
        addFromYourWatchList()
        addTopPicksForYou()
        addFanFavourites()
        addWatchFreeOnIMDb()
        addIMDbOriginals()
        addExploreWhatsStreaming()
        addPrimeVideo()
        addExploreMoviesAndTVShows()
        addInTheatres()
        addBoxOffice()
        addComingSoon()
        addBornToday()
        addTopNews()
        addFollowIMDb()
    }

    private fun add() {
        viewModelScope.launch {
            list = iRepo.add()
        }
    }

    private fun addFeaturedToday() {
        viewModelScope.launch {
            listFeaturedToday = iRepo.addFeaturedToday()
        }
    }

    private fun featuredTodayPictures() {
        viewModelScope.launch {
            listFeaturedTodayPicture = iRepo.addFeaturedTodayPictures()
        }
    }

    private fun addWhatToWatch() {
        viewModelScope.launch {
            listWhatToWatch = iRepo.addWhatToWatch()
        }
    }

    private fun addTrendingOnYourServices() {
        viewModelScope.launch {
            listTrendingOnYourServices = iRepo.addTrendingOnYourServices()
        }
    }

    private fun addFromYourWatchList() {
        viewModelScope.launch {
            listFromYourWatchList = iRepo.addFromYourWatchList()
        }
    }

    private fun addTopPicksForYou() {
        viewModelScope.launch {
            listTopPicksForYou = iRepo.addTopPicksForYou()
        }
    }

    private fun addFanFavourites() {
        viewModelScope.launch {
            listFanFavouritesList = iRepo.addFanFavourites()
        }
    }

    private fun addWatchFreeOnIMDb() {
        viewModelScope.launch {
            listWatchFreeOnIMDb = iRepo.addWatchFreeOnIMDb()
        }
    }

    private fun addIMDbOriginals() {
        viewModelScope.launch {
            listIMDbOriginals = iRepo.addIMDbOriginals()
        }
    }

    private fun addExploreWhatsStreaming() {
        viewModelScope.launch {
            listExploreWhatsStreaming = iRepo.addExploreWhatsStreaming()
        }
    }

    private fun addPrimeVideo() {
        viewModelScope.launch {
            listPrimeVideo = iRepo.addPrimeVideo()
        }
    }

    private fun addExploreMoviesAndTVShows() {
        viewModelScope.launch {
            listExploreMoviesAndTVShows = iRepo.addExploreMoviesAndTVShows()
        }
    }

    private fun addInTheatres() {
        viewModelScope.launch {
            listInTheatres = iRepo.addInTheatres()
        }
    }

    private fun addBoxOffice() {
        viewModelScope.launch {
            listBoxOffice = iRepo.addBoxOffice()
        }
    }

    private fun addComingSoon() {
        viewModelScope.launch {
            listComingSoon = iRepo.addComingSoon()
        }
    }

    private fun addBornToday() {
        viewModelScope.launch {
            listBornToday = iRepo.addBornToday()
        }
    }

    private fun addTopNews() {
        viewModelScope.launch {
            listTopNews = iRepo.addTopNews()
        }
    }

    private fun addFollowIMDb() {
        viewModelScope.launch {
            listFollowIMDb = iRepo.addFollowIMDb()
        }
    }
}