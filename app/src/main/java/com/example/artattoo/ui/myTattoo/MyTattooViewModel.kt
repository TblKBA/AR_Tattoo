package com.example.artattoo.ui.myTattoo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyTattooViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "MY TATTOO"
    }
    val text: LiveData<String> = _text
}