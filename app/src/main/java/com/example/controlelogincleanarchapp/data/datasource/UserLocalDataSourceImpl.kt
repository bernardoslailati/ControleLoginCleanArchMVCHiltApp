package com.example.controlelogincleanarchapp.data.datasource

import android.content.Context
import android.widget.Toast
import com.example.controlelogincleanarchapp.data.mock.mockProfile
import com.example.controlelogincleanarchapp.data.model.Profile
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class UserLocalDataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context
): UserLocalDataSource {
    
    override fun getProfile(): Profile {
        Toast.makeText(context, "$mockProfile\n\n$context", Toast.LENGTH_LONG).show()
        return mockProfile
    }
    
}