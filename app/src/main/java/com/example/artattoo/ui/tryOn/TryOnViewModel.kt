package com.example.artattoo.ui.tryOn

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TryOnViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        //value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text
}