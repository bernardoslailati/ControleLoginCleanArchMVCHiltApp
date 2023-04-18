package com.example.data.datasource

import com.example.data.di.FirebaseLoginService
import com.example.data.service.LoginService
import javax.inject.Inject

class UserRemoteDataSourceImpl @Inject constructor(
    @FirebaseLoginService
    private val loginService: LoginService
): UserRemoteDataSource {
    
    override fun login(email: String, password: String): Boolean {
        return loginService.login(email, password)
    }
    
}