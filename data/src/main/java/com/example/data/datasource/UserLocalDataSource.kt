package com.example.data.datasource

import com.example.data.model.ProfileLocalModel

interface UserLocalDataSource {
    
    fun getProfile(): ProfileLocalModel
    
}