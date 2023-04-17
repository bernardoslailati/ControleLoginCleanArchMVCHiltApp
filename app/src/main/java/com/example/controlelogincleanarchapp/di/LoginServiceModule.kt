package com.example.controlelogincleanarchapp.di

import com.example.controlelogincleanarchapp.data.network.LoginService
import com.example.controlelogincleanarchapp.data.network.authentication.FirebaseAuthenticator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object LoginServiceModule {

//    @Provides
//    fun provideLoginRetrofitService(): LoginService {
//        return Retrofit.Builder()
//            .baseUrl("https://my-backend.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//            .create(LoginService::class.java)
//    }
    
    @Provides
    fun provideLoginFirebaseService(): LoginService {
        return FirebaseAuthenticator.provideLoginService()
    }
    
}