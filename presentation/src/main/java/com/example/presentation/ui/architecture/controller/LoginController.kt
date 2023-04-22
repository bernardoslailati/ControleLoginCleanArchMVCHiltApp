package com.example.presentation.ui.architecture.controller

import android.widget.Toast
import com.example.domain.usecase.GetProfileUseCase
import com.example.domain.usecase.LoginUseCase
import com.example.presentation.databinding.ActivityLoginBinding
import javax.inject.Inject

class LoginController @Inject constructor(
    private val loginActivityMainBinding: ActivityLoginBinding,
    private val getProfileUseCase: GetProfileUseCase,
    private val loginUseCase: LoginUseCase,
) {
    
    fun showProfile() {
        val profile = getProfileUseCase.execute()
        loginActivityMainBinding.tvWelcomeProgrammer.text =
            "Bem-vindo ${profile.fullName}!"
    }
    
    fun login() {
        val isLoggedIn = loginUseCase.execute(
            email = loginActivityMainBinding.tietEmail.text.toString(),
            password = loginActivityMainBinding.tietPassword.text.toString(),
        )
        
        Toast.makeText(
            loginActivityMainBinding.root.context,
            if (isLoggedIn) "Redirecionando para tela de início..." else "Falha ao logar usuário. Tente novamente.",
            Toast.LENGTH_SHORT
        ).show()
    }
}