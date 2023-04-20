package com.example.presentation.controller

import com.example.domain.usecase.GetProfileUseCase
import com.example.presentation.databinding.ActivityLoginBinding
import javax.inject.Inject

class LoginController @Inject constructor(
    private val loginActivityMainBinding: ActivityLoginBinding,
    private val getProfileUseCase: GetProfileUseCase
) {
    
    fun showProfile() {
        val profile = getProfileUseCase.execute()
        loginActivityMainBinding.tvWelcomeProgrammer.text =
            "Bem-vindo ${profile.fullName}!"
    }
    
}