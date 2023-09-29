package com.eniskaner.imdbmainrecyclerviewhw6.di

import com.eniskaner.imdbmainrecyclerviewhw6.data.datasource.IMDbDataSource
import com.eniskaner.imdbmainrecyclerviewhw6.data.repo.IMDbRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideIMDbRepository(ids: IMDbDataSource) : IMDbRepository {
        return IMDbRepository(ids)
    }

    @Provides
    @Singleton
    fun provideIMDbDataSource() : IMDbDataSource {
        return IMDbDataSource()
    }
}