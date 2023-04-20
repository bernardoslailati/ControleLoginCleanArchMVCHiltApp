package com.example.domain.repository

import com.example.data.datasource.UserLocalDataSource
import com.example.data.datasource.UserRemoteDataSource
import com.example.data.model.ProfileLocalModel
import com.example.data.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource,
): UserRepository {
    
    override fun login(email: String, password: String): Boolean {
        return userRemoteDataSource.login(email, password)
    }
    
    override fun getProfile(): ProfileLocalModel {
        return userLocalDataSource.getProfile()
    }
    
}