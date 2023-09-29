package com.eniskaner.imdbmainrecyclerviewhw6.ui.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import com.eniskaner.imdbmainrecyclerviewhw6.databinding.ActivityMainBinding
import com.eniskaner.imdbmainrecyclerviewhw6.ui.adapter.MainAdapter
import com.eniskaner.imdbmainrecyclerviewhw6.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private val mainList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        getMainData(viewModel)
        collectMainData()
    }

    private fun init() {
        setMainRecyclerView()
    }

    private fun setMainRecyclerView() {
        binding.mainRecyclerView.run {
            hasFixedSize()
            adapter = MainAdapter()
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun collectMainData(): List<DataModel> {
        mainList?.let {
            binding.mainRecyclerView.adapter = MainAdapter().apply {
                submitList(mainList)
            }
        }
        return mainList
    }

    private fun getMainData(viewModel: MainViewModel): List<DataModel> {

        CoroutineScope(Dispatchers.Main).launch {
            viewModel.run {
                list.map { viewPagerListItem ->
                    mainList.add(DataModel.ViewPagerList().apply {
                        viewPager = viewPagerListItem.viewPager
                    })
                }

                listFeaturedToday.map { featuredTodayList ->
                    mainList.add(DataModel.FeaturedToday(featuredTodayHeadline = featuredTodayList.featuredTodayHeadline))
                }

                listFeaturedTodayPicture.map { listFeaturedTodayPictureListItem ->
                    mainList.add(DataModel.FeaturedTodayPicturesList().apply {
                        featuredTodayPictures = listFeaturedTodayPictureListItem.featuredTodayPictures
                    })
                }

                listWhatToWatch.map { listWhatToWatchList ->
                    mainList.add(DataModel.WhatToWatch(whatToWatchHeadline = listWhatToWatchList.whatToWatchHeadline))
                }

                listTrendingOnYourServices.map { listTrendingOnYourServicesListItem ->
                    mainList.add(DataModel.TrendingOnYourServicesList().apply {
                        trendingOnYourServices = listTrendingOnYourServicesListItem.trendingOnYourServices
                    })
                }

                listFromYourWatchList.map { listFromYourWatchList ->
                    mainList.add(DataModel.FromYourWatchList(fromYourWatchListHeadline = listFromYourWatchList.fromYourWatchListHeadline))
                }

                listTopPicksForYou.map { listTopPicksForYouListItem ->
                    mainList.add(DataModel.TopPicksForYouList().apply {
                        topPicksForYou = listTopPicksForYouListItem.topPicksForYou
                    })
                }

                listFanFavouritesList.map { listFanFavouritesListItem ->
                    mainList.add(DataModel.FanFavouritesList().apply {
                        fanFavourites = listFanFavouritesListItem.fanFavourites
                    })
                }

                listWatchFreeOnIMDb.map { listWatchFreeOnIMDb ->
                    mainList.add(DataModel.WatchFreeOnIMDb(watchFreeOnIMDbHeadline = listWatchFreeOnIMDb.watchFreeOnIMDbHeadline))
                }

                listIMDbOriginals.map { listIMDbOriginalsItem ->
                    mainList.add(DataModel.IMDbOriginalsList().apply {
                        imdbOriginals = listIMDbOriginalsItem.imdbOriginals
                    })
                }

                listExploreWhatsStreaming.map { listExploreWhatsStreaming ->
                    mainList.add(DataModel.ExploreWhatsStreaming(streamingHeadline = listExploreWhatsStreaming.streamingHeadline))
                }

                listPrimeVideo.map { listPrimeVideoItem ->
                    mainList.add(DataModel.PrimeVideoList().apply {
                        primeVideo = listPrimeVideoItem.primeVideo
                    })
                }

                listExploreMoviesAndTVShows.map { listExploreMoviesAndTVShows ->
                    mainList.add(DataModel.ExploreMoviesAndTVShows(exploreHeadline = listExploreMoviesAndTVShows.exploreHeadline))
                }

                listInTheatres.map { listInTheatresItem ->
                    mainList.add(DataModel.InTheatresList().apply {
                        inTheatres = listInTheatresItem.inTheatres
                    })
                }

                listBoxOffice.map { listBoxOfficeItem ->
                    mainList.add(DataModel.BoxOfficeList().apply {
                        boxOffice = listBoxOfficeItem.boxOffice
                    })
                }

                listComingSoon.map { listComingSoonItem ->
                    mainList.add(DataModel.ComingSoonList().apply {
                        comingSoon = listComingSoonItem.comingSoon
                    })
                }

                listBornToday.map { listBornTodayItem ->
                    mainList.add(DataModel.BornTodayList().apply {
                        bornToday = listBornTodayItem.bornToday
                    })
                }
                listTopNews.map {listTopNews ->
                    mainList.add(DataModel.TopNews().apply {
                        topNewsHeadline = listTopNews.topNewsHeadline
                        topNewsPoster = listTopNews.topNewsPoster
                        topNewsContents = listTopNews.topNewsContents
                    })
                }

                listFollowIMDb.map { listFollowIMDbItem ->
                    mainList.add(DataModel.FollowIMDb().apply {
                        followImdbHeadline = listFollowIMDbItem.followImdbHeadline
                    })
                }
            }
        }
        return mainList
    }
}
