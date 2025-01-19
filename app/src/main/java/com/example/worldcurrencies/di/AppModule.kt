package com.example.worldcurrencies.di

import com.example.worldcurrencies.data.DatabasePrototype
import com.example.worldcurrencies.data.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(impl: DatabasePrototype): Repository
}