package com.example.controlelogincleanarchapp.ui.viewmodel

import com.example.controlelogincleanarchapp.data.model.Profile
import com.example.controlelogincleanarchapp.data.repository.UserRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(
  private val userRepository: UserRepository
) {
  
  fun login(email: String, password: String): Boolean {
    return userRepository.login(email, password)
  }
  
  fun getProfile(): Profile {
    return userRepository.getProfile()
  }
  
}