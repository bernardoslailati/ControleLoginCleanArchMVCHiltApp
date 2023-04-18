package com.example.data.di

import com.example.data.datasource.UserLocalDataSource
import com.example.data.datasource.UserLocalDataSourceImpl
import com.example.data.datasource.UserRemoteDataSource
import com.example.data.datasource.UserRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class LoginDataSourceModule {
    
    @Binds
    abstract fun bindUserRemoteDataSource(
        userRemoteDataSourceImpl: UserRemoteDataSourceImpl
    ): UserRemoteDataSource
    
    @Binds
    abstract fun bindUserLocalDataSource(
        userLocalDataSourceImpl: UserLocalDataSourceImpl
    ): UserLocalDataSource
    
}