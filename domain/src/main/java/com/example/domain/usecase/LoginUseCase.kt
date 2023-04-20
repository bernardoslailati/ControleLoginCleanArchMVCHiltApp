package com.example.domain.usecase

import com.example.data.repository.UserRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    
    fun execute(email: String, password: String): Boolean =
        userRepository.login(email, password)
    
}