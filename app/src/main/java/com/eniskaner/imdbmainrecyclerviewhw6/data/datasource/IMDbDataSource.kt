package com.eniskaner.imdbmainrecyclerviewhw6.data.datasource

import com.eniskaner.imdbmainrecyclerviewhw6.data.entity.DataModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class IMDbDataSource {

    suspend fun add(): MutableList<DataModel.ViewPagerList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.ViewPager>()
        val listV = mutableListOf<DataModel.ViewPagerList>()
        val l1 = DataModel.ViewPager(
            viewPagerContents = "Watch Now",
            viewPagerHeadline = "Seen On Screen: Elvis and Priscilla Presley",
            viewPagerHorizontalPoster = "elvis_priscilla_presley",
            viewPagerVerticalPoster = "imdb_originals"
        )
        val l2 = DataModel.ViewPager(
            viewPagerContents = "Watch the Trailer",
            viewPagerHeadline = "\"Rick and Morty\"",
            viewPagerHorizontalPoster = "rick_morty_h",
            viewPagerVerticalPoster = "rick_morty_v"
        )
        val l3 = DataModel.ViewPager(
            viewPagerContents = "Watch the New Teaser",
            viewPagerHeadline = "\"True Detective\"",
            viewPagerHorizontalPoster = "true_detective_h",
            viewPagerVerticalPoster = "true_detective_v"
        )
        val l4 = DataModel.ViewPager(
            viewPagerContents = "Watch the Trailer",
            viewPagerHeadline = "\"Fingernails\"",
            viewPagerHorizontalPoster = "fingernails_h",
            viewPagerVerticalPoster = "fingernails_v"
        )
        val l5 = DataModel.ViewPager(
            viewPagerContents = "How the Franchise Inspired 'Sin City'",
            viewPagerHeadline = "What \'Spy Kids\' Tought Robert Rodriguez About Parenting ",
            viewPagerHorizontalPoster = "spy_kids_h",
            viewPagerVerticalPoster = "imdb_originals"
        )
        val l6 = DataModel.ViewPager(
            viewPagerContents = "Watch the Trailer",
            viewPagerHeadline = "\'All of Us Strangers\'",
            viewPagerHorizontalPoster = "all_of_us_strangers_h",
            viewPagerVerticalPoster = "all_of_us_strangers_v"
        )
        val l7 = DataModel.ViewPager(
            viewPagerContents = "Watch the Trailer",
            viewPagerHeadline = "\'Argylle\'",
            viewPagerHorizontalPoster = "argylle_h",
            viewPagerVerticalPoster = "argylle_v"
        )
        val l8 = DataModel.ViewPager(
            viewPagerContents = "Top-Rated Anime Based on Manga",
            viewPagerHeadline = "5 Anime Picks to Stream Now",
            viewPagerHorizontalPoster = "anime_picks_h",
            viewPagerVerticalPoster = "anime_picks_v"
        )
        val l9 = DataModel.ViewPager(
            viewPagerContents = "Watch the Trailer",
            viewPagerHeadline = "\'May December\'",
            viewPagerHorizontalPoster = "may_december_h",
            viewPagerVerticalPoster = "may_december_v"
        )
        val l10 = DataModel.ViewPager(
            viewPagerContents = "What\'s Going on at Godolkin University?",
            viewPagerHeadline = "ALl About\"Gen V\"",
            viewPagerHorizontalPoster = "all_about_h",
            viewPagerVerticalPoster = "all_about_v"
        )
        val l11 = DataModel.ViewPager(
            viewPagerContents = "Watch the Trailer",
            viewPagerHeadline = "Ariana DeBose and Alan Tudyk Star in \'Wish\'",
            viewPagerHorizontalPoster = "wish_h",
            viewPagerVerticalPoster = "wish_v"
        )
        val l12 = DataModel.ViewPager(
            viewPagerContents = "Watch the New Trailer",
            viewPagerHeadline = "\'The Hunger Games: The Ballad of Songbirds and Snakes\'",
            viewPagerHorizontalPoster = "the_hunger_games_h",
            viewPagerVerticalPoster = "the_hunger_games_v"
        )
        val l13 = DataModel.ViewPager(
            viewPagerContents = "All About \'Joker: Folie à Deux\'",
            viewPagerHeadline = "The Latest on the \'Joker\' Sequel",
            viewPagerHorizontalPoster = "joker_h",
            viewPagerVerticalPoster = "all_about_v"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        list.add(l5)
        list.add(l6)
        list.add(l7)
        list.add(l8)
        list.add(l9)
        list.add(l10)
        list.add(l11)
        list.add(l12)
        list.add(l13)
        listV.add(DataModel.ViewPagerList().apply {
            viewPager = list
        })
        return@withContext listV
    }

    suspend fun addFeaturedToday(): MutableList<DataModel.FeaturedToday> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.FeaturedToday>()
        val l1 = DataModel.FeaturedToday(
            featuredTodayHeadline = "Featured Today"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addFeaturedTodayPictures(): MutableList<DataModel.FeaturedTodayPicturesList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.FeaturedTodayPictures>()
        val listV = mutableListOf<DataModel.FeaturedTodayPicturesList>()
        val l1 = DataModel.FeaturedTodayPictures(
            featuredTodayPictures1 = "gen_v_ft",
            featuredTodayPictures2 = "saw_x_ft",
            featuredTodayPictures3 = "creator_ft",
            featuredTodayPicturesTitle = "What to Watch This Weekend"
        )
        val l2 = DataModel.FeaturedTodayPictures(
            featuredTodayPictures1 = "dark_winds_ft",
            featuredTodayPictures2 = "alice_in_borderland_ft",
            featuredTodayPictures3 = "heels_ft",
            featuredTodayPicturesTitle = "Renewed or Canceled? \"Dark Winds,\" \"Heels\" and More "
        )
        val l3 = DataModel.FeaturedTodayPictures(
            featuredTodayPictures1 = "saw_x_ft",
            featuredTodayPictures2 = "jig_saw_ft",
            featuredTodayPictures3 = "saw_vi_ft",
            featuredTodayPicturesTitle = "We Want to Play a Game:Saw Movies Ranked"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        listV.add(DataModel.FeaturedTodayPicturesList().apply {
            featuredTodayPictures = list
        })
        return@withContext listV
    }

    suspend fun addWhatToWatch(): MutableList<DataModel.WhatToWatch> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.WhatToWatch>()
        val l1 = DataModel.WhatToWatch(
            whatToWatchHeadline = "What to watch"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addTrendingOnYourServices(): MutableList<DataModel.TrendingOnYourServicesList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.TrendingOnYourServices>()
        val listV = mutableListOf<DataModel.TrendingOnYourServicesList>()
        val l1 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "538eps",
            trendingOnYourServicesPoster = "law_order_toys",
            trendingOnYourServicesRating = "8.1",
            trendingOnYourServicesTitle = "Law & Order: Special Victims",
            trendingOnYourServicesYear = "1999"
        )
        val l2 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "8eps",
            trendingOnYourServicesPoster = "harlan_cobens_shelter_toys",
            trendingOnYourServicesRating = "6.6",
            trendingOnYourServicesTitle = "Harlan Coben\'s Shelter",
            trendingOnYourServicesYear = "2023"
        )
        val l3 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "3eps",
            trendingOnYourServicesPoster = "continental_toys",
            trendingOnYourServicesRating = "7.5",
            trendingOnYourServicesTitle = "The Continental",
            trendingOnYourServicesYear = "2023"
        )
        val l4 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "15  2h 49m",
            trendingOnYourServicesPoster = "john_wick_4_toys",
            trendingOnYourServicesRating = "7.8",
            trendingOnYourServicesTitle = "John Wick: Chapter 4",
            trendingOnYourServicesYear = "2023"
        )
        val l5 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "15  2h 3m",
            trendingOnYourServicesPoster = "covenant_toys",
            trendingOnYourServicesRating = "7.5",
            trendingOnYourServicesTitle = "The Covenant",
            trendingOnYourServicesYear = "2023"
        )
        val l6 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "188eps",
            trendingOnYourServicesPoster = "office_toys",
            trendingOnYourServicesRating = "9.0",
            trendingOnYourServicesTitle = "The Office",
            trendingOnYourServicesYear = "2005"
        )
        val l7 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "327eps",
            trendingOnYourServicesPoster = "supernatural_toys",
            trendingOnYourServicesRating = "8.4",
            trendingOnYourServicesTitle = "Supernatural",
            trendingOnYourServicesYear = "2005"
        )
        val l8 = DataModel.TrendingOnYourServices(
            trendingOnYourServicesEpisode = "280eps",
            trendingOnYourServicesPoster = "big_bang_theory_toys",
            trendingOnYourServicesRating = "8.2",
            trendingOnYourServicesTitle = "The Big Bang Theory",
            trendingOnYourServicesYear = "2006"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        list.add(l5)
        list.add(l6)
        list.add(l7)
        list.add(l8)
        listV.add(DataModel.TrendingOnYourServicesList().apply {
            trendingOnYourServices = list
        })
        return@withContext listV
    }

    suspend fun addFromYourWatchList(): MutableList<DataModel.FromYourWatchList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.FromYourWatchList>()
        val l1 = DataModel.FromYourWatchList(
            fromYourWatchListHeadline = "From your Watchlist"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addTopPicksForYou(): MutableList<DataModel.TopPicksForYouList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.TopPicksForYou>()
        val listV = mutableListOf<DataModel.TopPicksForYouList>()
        val l1 = DataModel.TopPicksForYou(
            topPicksForYouDuration = "1h 46m",
            topPicksForYouPoster = "evil_does_not_exist_tp",
            topPicksForYouRating = "7.4",
            topPicksForYouTitle = "Evil Does Not Exist",
            topPicksForYouYear = "2023"
        )
        val l2 = DataModel.TopPicksForYou(
            topPicksForYouDuration = "2h 26m",
            topPicksForYouPoster = "the_beast_tp",
            topPicksForYouRating = "6.9",
            topPicksForYouTitle = "The Beast",
            topPicksForYouYear = "2024"
        )
        val l3 = DataModel.TopPicksForYou(
            topPicksForYouDuration = "2h 7m",
            topPicksForYouPoster = "the_promised_land_tp",
            topPicksForYouRating = "7.6",
            topPicksForYouTitle = "The Promised Land",
            topPicksForYouYear = "2024"
        )
        val l4 = DataModel.TopPicksForYou(
            topPicksForYouDuration = "R   2h 9m",
            topPicksForYouPoster = "maestro_tp",
            topPicksForYouRating = "6.6",
            topPicksForYouTitle = "Maestro",
            topPicksForYouYear = "2023"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        listV.add(DataModel.TopPicksForYouList().apply {
            topPicksForYou = list
        })
        return@withContext listV
    }

    suspend fun addFanFavourites(): MutableList<DataModel.FanFavouritesList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.FanFavourites>()
        val listV = mutableListOf<DataModel.FanFavouritesList>()
        val l1 = DataModel.FanFavourites(
            fanFavouritesAge = "12A",
            fanFavouritesDuration = "1h 54m",
            fanFavouritesPoster = "barbie_ff",
            fanFavouritesRating = "7.1",
            fanFavouritesTitle = "Barbie",
            fanFavouritesYear = "2023"
        )
        val l2 = DataModel.FanFavourites(
            fanFavouritesAge = "9eps",
            fanFavouritesDuration = "",
            fanFavouritesPoster = "one_piece_ff",
            fanFavouritesRating = "8.4",
            fanFavouritesTitle = "One Piece",
            fanFavouritesYear = "2023"
        )
        val l3 = DataModel.FanFavourites(
            fanFavouritesAge = "15",
            fanFavouritesDuration = "3h",
            fanFavouritesPoster = "oppenheimer_ff",
            fanFavouritesRating = "8.6",
            fanFavouritesTitle = "Oppenheimer",
            fanFavouritesYear = "2023"
        )
        val l4 = DataModel.FanFavourites(
            fanFavouritesAge = "15",
            fanFavouritesDuration = "1h 35m",
            fanFavouritesPoster = "talk_to_me_ff",
            fanFavouritesRating = "7.2",
            fanFavouritesTitle = "Talk to Me",
            fanFavouritesYear = "2023"
        )
        val l5 = DataModel.FanFavourites(
            fanFavouritesAge = "15",
            fanFavouritesDuration = "2h 49m",
            fanFavouritesPoster = "jawan_ff",
            fanFavouritesRating = "7.6",
            fanFavouritesTitle = "Jawan",
            fanFavouritesYear = "2023"
        )
        val l6 = DataModel.FanFavourites(
            fanFavouritesAge = "PG",
            fanFavouritesDuration = "1h 41m",
            fanFavouritesPoster = "elemental_ff",
            fanFavouritesRating = "7.0",
            fanFavouritesTitle = "Elemental",
            fanFavouritesYear = "2023"
        )
        val l7 = DataModel.FanFavourites(
            fanFavouritesAge = "8eps",
            fanFavouritesDuration = "",
            fanFavouritesPoster = "ashoka_ff",
            fanFavouritesRating = "8.0",
            fanFavouritesTitle = "Ashoka",
            fanFavouritesYear = "2023"
        )
        val l8 = DataModel.FanFavourites(
            fanFavouritesAge = "32eps",
            fanFavouritesDuration = "",
            fanFavouritesPoster = "sex_education_ff",
            fanFavouritesRating = "7.2",
            fanFavouritesTitle = "Sex Education",
            fanFavouritesYear = "2019"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        list.add(l5)
        list.add(l6)
        list.add(l7)
        list.add(l8)
        listV.add(DataModel.FanFavouritesList().apply {
            fanFavourites = list
        })
        return@withContext listV
    }

    suspend fun addWatchFreeOnIMDb(): MutableList<DataModel.WatchFreeOnIMDb> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.WatchFreeOnIMDb>()
        val l1 = DataModel.WatchFreeOnIMDb(
            watchFreeOnIMDbHeadline = "Watch free on IMDB"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addIMDbOriginals(): MutableList<DataModel.IMDbOriginalsList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.IMDbOriginals>()
        val listV = mutableListOf<DataModel.IMDbOriginalsList>()
        val l1 = DataModel.IMDbOriginals(
            imdbOriginalsContents = "\'A Haunting In Venice\' Suspect List",
            imdbOriginalsPoster = "haunting_in_venice_io"
        )
        val l2 = DataModel.IMDbOriginals(
            imdbOriginalsContents = "Shah Rukh Khan on \'Jawan\' and More",
            imdbOriginalsPoster = "jawan_io"
        )
        val l3 = DataModel.IMDbOriginals(
            imdbOriginalsContents = "A Guide to the Films of Wes Anderson",
            imdbOriginalsPoster = "wes_anderson_io"
        )
        val l4 = DataModel.IMDbOriginals(
            imdbOriginalsContents = "Meet the Star of \"Gen V\"",
            imdbOriginalsPoster = "gen_v_io"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        listV.add(DataModel.IMDbOriginalsList().apply {
            imdbOriginals = list
        })
        return@withContext listV
    }

    suspend fun addExploreWhatsStreaming(): MutableList<DataModel.ExploreWhatsStreaming> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.ExploreWhatsStreaming>()
        val l1 = DataModel.ExploreWhatsStreaming(
            streamingHeadline = "Explore what\'s streaming"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addPrimeVideo(): MutableList<DataModel.PrimeVideoList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.PrimeVideo>()
        val listV = mutableListOf<DataModel.PrimeVideoList>()
        val l1 = DataModel.PrimeVideo(
            primeVideoEpisode = "21eps",
            primeVideoPoster = "the_wheel_of_time_pv",
            primeVideoRating = "7.1",
            primeVideoTitle = "The Wheel of Time",
            primeVideoYear = "2021"
        )
        val l2 = DataModel.PrimeVideo(
            primeVideoEpisode = "6eps",
            primeVideoPoster = "wilderness_pv",
            primeVideoRating = "6.3",
            primeVideoTitle = "Wilderness",
            primeVideoYear = "2023"
        )
        val l3 = DataModel.PrimeVideo(
            primeVideoEpisode = "3eps",
            primeVideoPoster = "continental_toys",
            primeVideoRating = "7.5",
            primeVideoTitle = "The Continental",
            primeVideoYear = "2023"
        )
        val l4 = DataModel.PrimeVideo(
            primeVideoEpisode = "PG   2h 1m",
            primeVideoPoster = "a_million_miles_away_pv",
            primeVideoRating = "7.4",
            primeVideoTitle = "A Million Miles Away",
            primeVideoYear = "2023"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        listV.add(DataModel.PrimeVideoList().apply {
            primeVideo = list
        })
        return@withContext listV
    }

    suspend fun addExploreMoviesAndTVShows(): MutableList<DataModel.ExploreMoviesAndTVShows> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.ExploreMoviesAndTVShows>()
        val l1 = DataModel.ExploreMoviesAndTVShows(
            exploreHeadline = "Explore movies and TV shows"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addInTheatres(): MutableList<DataModel.InTheatresList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.InTheatres>()
        val listV = mutableListOf<DataModel.InTheatresList>()
        val l1 = DataModel.InTheatres(
            inTheatresAge = "12A",
            inTheatresDuration = "1h 43m",
            inTheatresPoster = "haunting_in_venice_io",
            inTheatresRating = "6.8",
            inTheatresTitle = "A Haunting in Venice",
            inTheatresYear = "2023"
        )
        val l2 = DataModel.InTheatres(
            inTheatresAge = "12A",
            inTheatresDuration = "1h 54m",
            inTheatresPoster = "barbie_ff",
            inTheatresRating = "7.1",
            inTheatresTitle = "Barbie",
            inTheatresYear = "2023"
        )
        val l3 = DataModel.InTheatres(
            inTheatresAge = "15",
            inTheatresDuration = "1h 35m",
            inTheatresPoster = "talk_to_me_ff",
            inTheatresRating = "7.2",
            inTheatresTitle = "Talk to Me",
            inTheatresYear = "2023"
        )
        val l4 = DataModel.InTheatres(
            inTheatresAge = "15",
            inTheatresDuration = "3h",
            inTheatresPoster = "oppenheimer_ff",
            inTheatresRating = "8.6",
            inTheatresTitle = "Oppenheimer",
            inTheatresYear = "2023"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        listV.add(DataModel.InTheatresList().apply {
            inTheatres = list
        })
        return@withContext listV
    }

    suspend fun addBoxOffice(): MutableList<DataModel.BoxOfficeList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.BoxOffice>()
        val listV = mutableListOf<DataModel.BoxOfficeList>()
        val l1 = DataModel.BoxOffice(
            boxOfficeId = "1",
            boxOfficePrice = "$8,5M",
            boxOfficeTitle = "The Nun II"
        )
        val l2 = DataModel.BoxOffice(
            boxOfficeId = "2",
            boxOfficePrice = "$8M",
            boxOfficeTitle = "The Expendables 4"
        )
        val l3 = DataModel.BoxOffice(
            boxOfficeId = "3",
            boxOfficePrice = "$6,3M",
            boxOfficeTitle = "A Haunting Venice"
        )
        val l4 = DataModel.BoxOffice(
            boxOfficeId = "4",
            boxOfficePrice = "$4.7M",
            boxOfficeTitle = "The Equalizer 3"
        )
        val l5 = DataModel.BoxOffice(
            boxOfficeId = "5",
            boxOfficePrice = "$3,2M",
            boxOfficeTitle = "Barbie"
        )
        val l6 = DataModel.BoxOffice(
            boxOfficeId = "6",
            boxOfficePrice = "$3M",
            boxOfficeTitle = "My Big Fat Greek Wedding 3"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        list.add(l5)
        list.add(l6)
        listV.add(DataModel.BoxOfficeList().apply {
            boxOffice = list
        })
        return@withContext listV
    }

    suspend fun addComingSoon(): MutableList<DataModel.ComingSoonList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.ComingSoon>()
        val listV = mutableListOf<DataModel.ComingSoonList>()
        val l1 = DataModel.ComingSoon(
            comingSoonAge = "4h",
            comingSoonDurationTime = "",
            comingSoonPoster = "canelo_vs_charlo_cs",
            comingSoonRating = "",
            comingSoonTitle = "Canelo vs. Charlo",
            comingSoonYear = "2023"
        )
        val l2 = DataModel.ComingSoon(
            comingSoonAge = "",
            comingSoonDurationTime = "",
            comingSoonPoster = "idiots_cs",
            comingSoonRating = "",
            comingSoonTitle = "The Idiots",
            comingSoonYear = "2023"
        )
        val l3 = DataModel.ComingSoon(
            comingSoonAge = "4h",
            comingSoonDurationTime = "",
            comingSoonPoster = "speed_cs",
            comingSoonRating = "",
            comingSoonTitle = "S.P.E.E.D.",
            comingSoonYear = "2023"
        )
        val l4 = DataModel.ComingSoon(
            comingSoonAge = "1h 21m",
            comingSoonDurationTime = "",
            comingSoonPoster = "dreams_of_darkness_cs",
            comingSoonRating = "",
            comingSoonTitle = "Dreams of Darkness",
            comingSoonYear = "2023"
        )
        val l5 = DataModel.ComingSoon(
            comingSoonAge = "15",
            comingSoonDurationTime = "2h 1m",
            comingSoonPoster = "the_exorcist_cs",
            comingSoonRating = "",
            comingSoonTitle = "The Exorcist: Believer",
            comingSoonYear = "2023"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        list.add(l5)
        listV.add(DataModel.ComingSoonList().apply {
            comingSoon = list
        })
        return@withContext listV
    }

    suspend fun addBornToday(): MutableList<DataModel.BornTodayList> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.BornToday>()
        val listV = mutableListOf<DataModel.BornTodayList>()
        val l1 = DataModel.BornToday(
            bornTodayAge = "29",
            bornTodayName = "Nicholas Galitzine",
            bornTodayPoster = "nicholas_galitzine_bt"
        )
        val l2 = DataModel.BornToday(
            bornTodayAge = "-",
            bornTodayName = "Zibby Allen",
            bornTodayPoster = "zibby_allen_bt"
        )
        val l3 = DataModel.BornToday(
            bornTodayAge = "43",
            bornTodayName = "Zachary Levi",
            bornTodayPoster = "zachary_levi_bt"
        )
        val l4 = DataModel.BornToday(
            bornTodayAge = "81",
            bornTodayName = "Ian McShane",
            bornTodayPoster = "ian_mcshane_bt"
        )
        val l5 = DataModel.BornToday(
            bornTodayAge = "54",
            bornTodayName = "Erika Eleniak",
            bornTodayPoster = "erika_eleniak_bt"
        )
        list.add(l1)
        list.add(l2)
        list.add(l3)
        list.add(l4)
        list.add(l5)
        listV.add(DataModel.BornTodayList().apply {
            bornToday = list
        })
        return@withContext listV
    }

    suspend fun addTopNews(): MutableList<DataModel.TopNews> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.TopNews>()
        val l1 = DataModel.TopNews(
            topNewsHeadline = "Michael Gambon, British Stage Legend and Dumbledore in the \'Harry Potter Movies\', Dies at 82",
            topNewsContents = "Michael Gambon, a protégé of Laurence Olivier and giant of the British stage who portrayed Hogwarts headmaster Albus Dumbledore, apparently with little effort, in the final six Harry Potter movies, has died. He was 82.",
            topNewsPoster = "michael_gambon_tp"
        )
        list.add(l1)
        return@withContext list
    }

    suspend fun addFollowIMDb(): MutableList<DataModel.FollowIMDb> = withContext(Dispatchers.IO) {
        val list = mutableListOf<DataModel.FollowIMDb>()
        val l1 = DataModel.FollowIMDb(
            followImdbHeadline = "Follow IMDb"
        )
        list.add(l1)
        return@withContext list
    }
}