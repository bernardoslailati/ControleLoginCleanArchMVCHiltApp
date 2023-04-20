package com.example.domain.mapper

import com.example.data.model.ProfileLocalModel
import com.example.data.model.ProgrammingLanguageLocalModel
import com.example.domain.model.ProfileModel
import com.example.domain.model.ProgrammingLanguageModel

fun ProfileLocalModel.toDomain() : ProfileModel =
    ProfileModel(
        fullName = "${this.name} ${this.lastName}",
        email = this.email.orEmpty()
    )

fun ProgrammingLanguageLocalModel.toDomain() : ProgrammingLanguageModel =
    ProgrammingLanguageModel(
        name = this.name,
        imageUrl = this.imageUrl
    )