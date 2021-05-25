package com.example.register_android.di

import com.example.register_android.repository.NotePadRepository
import com.example.register_android.useCase.NotePadUseCase
import com.example.register_android.viewModel.NotePadViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val notePadModules = module {
    single { NotePadRepository() }
    single { NotePadUseCase(get()) }
    viewModel { NotePadViewModel(get()) }
}