package com.example.domain.usecase

import com.example.data.repository.UserRepository
import com.example.domain.mapper.toDomain
import com.example.domain.model.ProfileModel
import javax.inject.Inject

class GetProfileUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    
    fun execute(): ProfileModel = userRepository.getProfile().toDomain()
    
}