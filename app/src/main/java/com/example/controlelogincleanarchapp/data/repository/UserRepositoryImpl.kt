package com.example.controlelogincleanarchapp.data.repository

import com.example.data.UserLocalDataSource
import com.example.data.UserRemoteDataSource
import com.example.controlelogincleanarchapp.domain.model.Profile
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: com.example.data.UserLocalDataSource,
    private val userRemoteDataSource: com.example.data.UserRemoteDataSource,
): com.example.data.repository.UserRepository {
    
    override fun login(email: String, password: String): Boolean {
        return userRemoteDataSource.login(email, password)
    }
    
    override fun getProfile(): Profile {
        return userLocalDataSource.getProfile()
    }
    
}