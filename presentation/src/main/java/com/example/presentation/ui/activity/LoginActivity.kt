package com.example.presentation.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.presentation.ui.architecture.controller.LoginController
import com.example.presentation.databinding.ActivityLoginBinding
import com.example.presentation.ui.adapter.ProgrammingLanguageAdapter
import com.example.presentation.ui.architecture.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {
    
    @Inject
    lateinit var binding: ActivityLoginBinding
    
    @Inject
    lateinit var loginController: LoginController
    
    @Inject
    lateinit var programmingLanguageAdapter: ProgrammingLanguageAdapter
    
    @Inject
    lateinit var loginViewModel: LoginViewModel
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        
        setupView()
    }
    
    private fun setupView() {
        with(binding) {
            rvProgrammingLanguages.adapter = programmingLanguageAdapter
            
            loginController.showProfile()
            
            btnLogin.setOnClickListener {
//                Toast.makeText(baseContext, "${loginViewModel.getProfile()}", Toast.LENGTH_LONG).show()
//
//                val isLoggedIn = loginViewModel.login(
//                    email = tietEmail.text.toString(),
//                    password = tietPassword.text.toString()
//                )
//                Toast.makeText(baseContext, "isLoggedIn? $isLoggedIn", Toast.LENGTH_LONG).show()
                loginController.login()
            }
        }
    }
}