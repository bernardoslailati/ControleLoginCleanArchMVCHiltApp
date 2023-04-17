package com.example.controlelogincleanarchapp.data.repository

import com.example.controlelogincleanarchapp.data.datasource.UserLocalDataSource
import com.example.controlelogincleanarchapp.data.datasource.UserRemoteDataSource
import com.example.controlelogincleanarchapp.data.model.Profile
import com.example.controlelogincleanarchapp.data.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource,
): UserRepository {
    
    override fun login(email: String, password: String): Boolean {
        return userRemoteDataSource.login(email, password)
    }
    
    override fun getProfile(): Profile {
        return userLocalDataSource.getProfile()
    }
    
}