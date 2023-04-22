package com.example.presentation.ui.architecture.controller

import com.example.domain.usecase.GetProfileUseCase
import com.example.domain.usecase.LoginUseCase
import com.example.presentation.databinding.ActivityLoginBinding
import com.example.presentation.ui.extension.showToast
import javax.inject.Inject

class LoginController @Inject constructor(
    val loginActivityMainBinding: ActivityLoginBinding,
    private val getProfileUseCase: GetProfileUseCase,
    private val loginUseCase: LoginUseCase,
) {
    
    fun showProfile() {
        val profile = getProfileUseCase.execute()
        loginActivityMainBinding.tvWelcomeProgrammer.text =
            "Bem-vindo ${profile.fullName}!"
    }
    
    fun login() {
        with(loginActivityMainBinding) {
            val isLoggedIn = loginUseCase.execute(
                email = tietEmail.text.toString(),
                password = tietPassword.text.toString(),
            )
    
            root.context.showToast(
                message = if (isLoggedIn) "Redirecionando para tela de início..." else "Falha ao logar usuário. Tente novamente.",
            )
        }
        
    }
}