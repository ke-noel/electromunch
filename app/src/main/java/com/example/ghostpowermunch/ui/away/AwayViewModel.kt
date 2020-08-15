package com.example.ghostpowermunch.ui.away

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AwayViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Activate away mode when you have been gone for more than the following number of minutes:"
    }
    val text: LiveData<String> = _text
}