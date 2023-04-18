package com.example.data.repository

import com.example.data.model.ProfileLocalModel

interface UserRepository {
    
    fun login(email: String, password: String): Boolean
    
    fun getProfile(): ProfileLocalModel
    
}