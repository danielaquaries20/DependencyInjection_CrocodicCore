package com.example.dependencyinjection_crocodiccore

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.dependencyinjection_crocodiccore.data.SaveCounter2
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel2 @Inject constructor(private val saveCounter2: SaveCounter2) : ViewModel() {

    val counter = ObservableField(0)

    fun increaseCounter() {
//        val current = counter.get() ?: 0
//        counter.set(current + 1)
        saveCounter2.counter = saveCounter2.counter + 1
        sendValue()
    }

    fun decreaseCounter() {
//        val current = counter.get() ?: 0
//        counter.set(current - 1)
        saveCounter2.counter = saveCounter2.counter - 1
        sendValue()
    }

    fun sendValue() {
        counter.set(saveCounter2.counter)
    }

}