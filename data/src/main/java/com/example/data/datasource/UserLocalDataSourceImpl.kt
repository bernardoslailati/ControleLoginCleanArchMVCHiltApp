package com.example.data.datasource

import android.content.Context
import android.widget.Toast
import com.example.data.mock.mockProfileLocal
import com.example.data.model.ProfileLocalModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context
): UserLocalDataSource {
    
    override fun getProfile(): ProfileLocalModel {
        Toast.makeText(context, "$mockProfileLocal\n\n$context", Toast.LENGTH_LONG).show()
        return mockProfileLocal
    }
    
}