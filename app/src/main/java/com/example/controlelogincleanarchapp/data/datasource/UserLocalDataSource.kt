package com.example.controlelogincleanarchapp.data.datasource

import com.example.controlelogincleanarchapp.data.model.Profile

interface UserLocalDataSource {
    
    fun getProfile(): Profile
    
}