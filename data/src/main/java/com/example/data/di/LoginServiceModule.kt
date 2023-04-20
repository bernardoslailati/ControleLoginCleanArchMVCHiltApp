package com.example.data.di

import com.example.data.service.LoginService
import com.example.data.service.authentication.FirebaseAuthenticator
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
    fun provideLoginRetrofitService(): LoginService {
        return Retrofit.Builder()
            .baseUrl("https://my-backend.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LoginService::class.java)
    }
    
    @FirebaseLoginService
    @Provides
    fun provideLoginFirebaseService(): LoginService {
        return FirebaseAuthenticator.provideLoginService()
    }
    
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BackendLoginService

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirebaseLoginService