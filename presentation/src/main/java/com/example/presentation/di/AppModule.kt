package com.example.presentation.di

import android.content.Context
import android.view.LayoutInflater
import com.example.domain.mock.mockProgrammingLanguageList
import com.example.presentation.databinding.ActivityLoginBinding
import com.example.presentation.ui.adapter.ProgrammingLanguageAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
object ProgrammingLanguageModule {
    
    @Provides
    fun provideActivityLoginBinding(
        @ApplicationContext context: Context
    ): ActivityLoginBinding {
        return ActivityLoginBinding.inflate(LayoutInflater.from(context))
    }
    
    @Provides
    fun provideProgrammingLanguageAdapter(): ProgrammingLanguageAdapter {
        return ProgrammingLanguageAdapter(
            programmingLanguageList = mockProgrammingLanguageList
        )
    }
    
}