package com.example.register_android.useCase

import com.example.register_android.model.NotePad
import com.example.register_android.repository.NotePadRepository

class NotePadUseCase(private val repository: NotePadRepository) {

    fun getListNotePad() = repository.getListNotePad()
    fun saveNewNotePad(title: String, description: String,color:String) =
        repository.saveNewNotePad(NotePad(title, description,color))
}