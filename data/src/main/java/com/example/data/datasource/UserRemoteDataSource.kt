package com.example.data.datasource

interface UserRemoteDataSource {
    
    fun login(email: String, password: String): Boolean
    
}