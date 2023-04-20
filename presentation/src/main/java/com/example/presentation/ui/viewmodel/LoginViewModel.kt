package com.example.presentation.ui.viewmodel

import com.example.domain.model.ProfileModel
import com.example.domain.usecase.GetProfileUseCase
import com.example.domain.usecase.LoginUseCase
import javax.inject.Inject

class LoginViewModel @Inject constructor(
  private val getProfileUseCase: GetProfileUseCase,
  private val loginUseCase: LoginUseCase
) {
  
  fun login(email: String, password: String): Boolean {
    return loginUseCase.execute(email, password)
  }
  
  fun getProfile(): ProfileModel {
    return getProfileUseCase.execute()
  }
  
}