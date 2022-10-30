package com.sergienkoandrew.lab1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class TextViewModel: ViewModel() {
    val textValue: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}