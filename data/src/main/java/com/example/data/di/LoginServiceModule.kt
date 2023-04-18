package com.example.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
object LoginServiceModule {

    @BackendLoginService
    @Provides
    fun provideLoginRetrofitService(): com.example.data.service.LoginService {
        return Retrofit.Builder()
            .baseUrl("https://my-backend.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(com.example.data.service.LoginService::class.java)
    }
    
    @FirebaseLoginService
    @Provides
    fun provideLoginFirebaseService(): com.example.data.service.LoginService {
        return com.example.data.service.authentication.FirebaseAuthenticator.provideLoginService()
    }
    
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BackendLoginService

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirebaseLoginService