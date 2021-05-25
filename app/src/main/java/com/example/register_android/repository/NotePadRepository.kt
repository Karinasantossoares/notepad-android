package com.example.register_android.repository

import com.example.register_android.model.NotePad

class NotePadRepository {

    private val fakeListNotePad = listOf(
        NotePad("Nota um", "lembrar de fazer email", "#F6440B"),
        NotePad("Nota dois", "lemdlskdjlshbrar de fazer email","#F6440B"),
        NotePad("Nota tres", "lembrar de dpsjdiohs email", "#FFEB3B"),
        NotePad("Nota quatro", "lembrar de fazer email","#FFEB3B"),
        NotePad("Nota 5", "lembrardhfudgyfu","#8BC34A"),
        NotePad("Nota 7", "lembraaaa email","#8BC34A")
    )

    fun getListNotePad() = fakeListNotePad

    //Salvar no room
    fun saveNewNotePad(notePad: NotePad) {
        NotePad(notePad.title, notePad.description,notePad.colorNote)
    }
}