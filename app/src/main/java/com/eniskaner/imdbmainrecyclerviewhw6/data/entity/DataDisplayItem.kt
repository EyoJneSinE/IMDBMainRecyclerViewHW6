package com.eniskaner.imdbmainrecyclerviewhw6.data.entity

interface DataDisplayItem {

    fun type(): Int

    companion object {
        const val TYPE_VIEWPAGER_LIST = 0
        const val TYPE_FEATURED_TODAY = 1
        const val TYPE_FEATURED_TODAY_PICTURES_LIST = 2
        const val TYPE_WHAT_TO_WATCH = 3
        const val TYPE_TRENDING_ON_YOUR_SERVICES_LIST = 4
        const val TYPE_FROM_YOUR_WATCHLIST = 5
        const val TYPE_TOP_PICKS_FOR_YOU_LIST = 6
        const val TYPE_FAN_FAVOURITES_LIST = 7
        const val TYPE_WATCH_FREE_ON_IMDB = 8
        const val TYPE_IMDB_ORIGINALS_LIST = 9
        const val TYPE_EXPLORE_WHATS_STREAMING = 10
        const val TYPE_PRIME_VIDEO_LIST = 11
        const val TYPE_EXPLORE_MOVIES_AND_TV_SHOWS = 12
        const val TYPE_IN_THEATRES_LIST = 13
        const val TYPE_BOX_OFFICE_LIST = 14
        const val TYPE_COMING_SOON_LIST = 15
        const val TYPE_BORN_TODAY_LIST = 16
        const val TYPE_TOP_NEWS = 17
        const val TYPE_FOLLOW_IMDB = 18
        const val TYPE_VIEWPAGER = 19
        const val TYPE_FEATURED_TODAY_PICTURES = 20
        const val TYPE_TRENDING_ON_YOUR_SERVICES = 21
        const val TYPE_TOP_PICKS_FOR_YOU = 22
        const val TYPE_FAN_FAVOURITES = 23
        const val TYPE_IMDB_ORIGINALS = 24
        const val TYPE_PRIME_VIDEO = 25
        const val TYPE_IN_THEATRES = 26
        const val TYPE_BOX_OFFICE = 27
        const val TYPE_COMING_SOON = 28
        const val TYPE_BORN_TODAY = 29
    }
}