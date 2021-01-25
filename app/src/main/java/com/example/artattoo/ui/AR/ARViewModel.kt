package com.example.artattoo.ui.AR

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ARViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
      //  value = "AR"
    }
    val text: LiveData<String> = _text
}