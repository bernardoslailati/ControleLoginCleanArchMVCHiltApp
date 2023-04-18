package com.example.data.service.authentication

import com.example.data.service.LoginService

data class User(val email: String, val password: String)

val registeredUsers = listOf(
    User("teste@teste.com", "123"),
    User("teste2@teste2.com", "456")
)

object FirebaseAuthenticator {
    
    fun provideLoginService(): LoginService {
        return object : LoginService {
            override fun login(email: String, password: String): Boolean {
                return registeredUsers.any { it.email == email && it.password == password }
            }
        }
    }
}