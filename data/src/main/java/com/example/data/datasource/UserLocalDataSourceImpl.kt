package com.example.data.datasource

import android.content.Context
import com.example.data.mock.mockProfileLocal
import com.example.data.model.ProfileLocalModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context
): UserLocalDataSource {
    
    override fun getProfile(): ProfileLocalModel {
        return mockProfileLocal
    }
    
}