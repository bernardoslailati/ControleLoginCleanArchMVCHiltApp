package com.example.controlelogincleanarchapp.di

import com.example.controlelogincleanarchapp.domain.mock.mockProgrammingLanguageList
import com.example.controlelogincleanarchapp.ui.adapter.ProgrammingLanguageAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object ProgrammingLanguageModule {
    
    @Provides
    fun provideProgrammingLanguageAdapter(): ProgrammingLanguageAdapter {
        return ProgrammingLanguageAdapter(programmingLanguageList = mockProgrammingLanguageList)
    }
    
}