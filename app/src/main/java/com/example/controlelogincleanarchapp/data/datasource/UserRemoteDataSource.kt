package com.example.controlelogincleanarchapp.data.datasource

interface UserRemoteDataSource {
    
    fun login(email: String, password: String): Boolean
    
}