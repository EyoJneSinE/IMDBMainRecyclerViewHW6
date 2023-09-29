package com.eniskaner.imdbmainrecyclerviewhw6.data.entity

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
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_VIEWPAGER
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_VIEWPAGER_LIST
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_WATCH_FREE_ON_IMDB
import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataDisplayItem.Companion.TYPE_WHAT_TO_WATCH

sealed class DataModel: DataDisplayItem {

    data class ViewPagerList(
        var viewPager: List<ViewPager> = emptyList(),
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_VIEWPAGER_LIST
        }
    }

    data class ViewPager(
        var viewPagerHorizontalPoster: String,
        var viewPagerVerticalPoster: String,
        var viewPagerHeadline: String,
        var viewPagerContents: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_VIEWPAGER
        }
    }

    data class FeaturedToday(
        var featuredTodayHeadline: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FEATURED_TODAY
        }
    }

    data class FeaturedTodayPictures(
        var featuredTodayPicturesTitle: String,
        var featuredTodayPictures1: String,
        var featuredTodayPictures2: String,
        var featuredTodayPictures3: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FEATURED_TODAY_PICTURES
        }
    }

    data class FeaturedTodayPicturesList(
        var featuredTodayPictures: List<FeaturedTodayPictures> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FEATURED_TODAY_PICTURES_LIST
        }
    }

    data class WhatToWatch(
        var whatToWatchHeadline: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_WHAT_TO_WATCH
        }
    }

    data class TrendingOnYourServices(
        var trendingOnYourServicesPoster: String,
        var trendingOnYourServicesRating: String,
        var trendingOnYourServicesTitle: String,
        var trendingOnYourServicesYear: String,
        var trendingOnYourServicesEpisode: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_TRENDING_ON_YOUR_SERVICES
        }
    }

    data class TrendingOnYourServicesList(
        var trendingOnYourServices: List<TrendingOnYourServices> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_TRENDING_ON_YOUR_SERVICES
        }
    }

    data class FromYourWatchList(
        var fromYourWatchListHeadline: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FROM_YOUR_WATCHLIST
        }
    }

    data class TopPicksForYou(
        var topPicksForYouPoster: String,
        var topPicksForYouRating: String,
        var topPicksForYouTitle: String,
        var topPicksForYouYear: String,
        var topPicksForYouDuration: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_TOP_PICKS_FOR_YOU
        }
    }

    data class TopPicksForYouList(
        var topPicksForYou: List<TopPicksForYou> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_TOP_PICKS_FOR_YOU_LIST
        }
    }

    data class FanFavourites(
        var fanFavouritesPoster: String,
        var fanFavouritesRating: String,
        var fanFavouritesTitle: String,
        var fanFavouritesYear: String,
        var fanFavouritesAge: String,
        var fanFavouritesDuration: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FAN_FAVOURITES
        }
    }

    data class FanFavouritesList(
        var fanFavourites: List<FanFavourites> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FAN_FAVOURITES_LIST
        }
    }

    data class WatchFreeOnIMDb(
        var watchFreeOnIMDbHeadline: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_WATCH_FREE_ON_IMDB
        }
    }

    data class IMDbOriginals(
        var imdbOriginalsPoster: String,
        var imdbOriginalsContents: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_IMDB_ORIGINALS
        }
    }

    data class IMDbOriginalsList(
        var imdbOriginals: List<IMDbOriginals> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_IMDB_ORIGINALS_LIST
        }
    }

    data class ExploreWhatsStreaming(
        var streamingHeadline: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_EXPLORE_WHATS_STREAMING
        }
    }

    data class PrimeVideo(
        var primeVideoPoster: String,
        var primeVideoRating: String,
        var primeVideoTitle: String,
        var primeVideoYear: String,
        var primeVideoEpisode: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_PRIME_VIDEO
        }
    }

    data class PrimeVideoList(
        var primeVideo: List<PrimeVideo> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_PRIME_VIDEO_LIST
        }
    }

    data class ExploreMoviesAndTVShows(
        var exploreHeadline: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_EXPLORE_MOVIES_AND_TV_SHOWS
        }
    }

    data class InTheatres(
        var inTheatresPoster: String,
        var inTheatresRating: String,
        var inTheatresTitle: String,
        var inTheatresYear: String,
        var inTheatresAge: String,
        var inTheatresDuration: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_IN_THEATRES
        }
    }

    data class InTheatresList(
        var inTheatres: List<InTheatres> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_IN_THEATRES_LIST
        }
    }

    data class BoxOffice(
        var boxOfficeId: String,
        var boxOfficeTitle: String,
        var boxOfficePrice: String,
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_BOX_OFFICE
        }
    }

    data class BoxOfficeList(
        var boxOffice: List<BoxOffice> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_BOX_OFFICE_LIST
        }
    }

    data class ComingSoon(
        var comingSoonRating: String,
        var comingSoonPoster: String,
        var comingSoonTitle: String,
        var comingSoonYear: String,
        var comingSoonAge: String,
        var comingSoonDurationTime: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_COMING_SOON
        }
    }

    data class ComingSoonList(
        var comingSoon: List<ComingSoon> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_COMING_SOON_LIST
        }
    }

    data class BornToday(
        var bornTodayPoster: String,
        var bornTodayName: String,
        var bornTodayAge: String
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_BORN_TODAY
        }
    }

    data class BornTodayList(
        var bornToday: List<BornToday> = emptyList()
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_BORN_TODAY_LIST
        }
    }

    data class TopNews(
        var topNewsPoster: String = "",
        var topNewsHeadline:String = "",
        var topNewsContents: String = ""
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_TOP_NEWS
        }
    }

    data class FollowIMDb(
        var followImdbHeadline: String = ""
    ): DataModel(), DataDisplayItem {
        override fun type(): Int {
            return TYPE_FOLLOW_IMDB
        }
    }
}