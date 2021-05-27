package com.example.register_android.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.register_android.model.NotePad
import com.example.register_android.useCase.NotePadUseCase

class NotePadViewModel(
    private val useCase: NotePadUseCase
) : ViewModel() {


    private val listNotePad = MutableLiveData<List<NotePad>>()
    val stateListNotePad: LiveData<List<NotePad>>
        get() = listNotePad

    private val _shareText = MutableLiveData<String>()
    val shareText: LiveData<String>
        get() = _shareText

    private val _imageAttchamentNotePad = MutableLiveData<List<String>>()
    val imageAttchamentNotePad: LiveData<List<String>>
        get() = _imageAttchamentNotePad

    init {
        getLitsNotePad()
    }


    fun getLitsNotePad() {
        listNotePad.value = useCase.getListNotePad()
    }

    fun saveNewNotePad(title:String,description:String,color:String) {
        useCase.saveNewNotePad(title, description,color)
    }

    fun onLongTap(notepad: NotePad) {
        _shareText.value = notepad.let {
            it.title+"\n\n"+it.description
        }
    }

    fun uploadAttachmentImages(){

    }
}