package com.example.controlelogincleanarchapp.data.datasource

import com.example.controlelogincleanarchapp.data.network.LoginService
import javax.inject.Inject

class UserRemoteDataSourceImpl @Inject constructor(
    private val loginService: LoginService
): UserRemoteDataSource {
    
    override fun login(email: String, password: String): Boolean {
        return loginService.login(email, password)
    }
    
}