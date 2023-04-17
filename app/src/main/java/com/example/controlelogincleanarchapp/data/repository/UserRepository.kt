package com.example.controlelogincleanarchapp.data.repository

import com.example.controlelogincleanarchapp.data.model.Profile

interface UserRepository {
    
    fun login(email: String, password: String): Boolean
    
    fun getProfile(): Profile
    
}