package com.example.dependencyinjection_crocodiccore

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjection_crocodiccore.data.SaveCounter

class MainViewModel(private val saveCounter: SaveCounter) : ViewModel() {
    val counter = ObservableField(0)

    fun increaseCounter() {
//        val current = counter.get() ?: 0
//        counter.set(current + 1)
        saveCounter.counter = saveCounter.counter + 1
        sendValue()
    }

    fun decreaseCounter() {
//        val current = counter.get() ?: 0
//        counter.set(current - 1)
        saveCounter.counter = saveCounter.counter - 1
        sendValue()
    }

    fun sendValue() {
        counter.set(saveCounter.counter)
    }

    class Factory(private val saveCounter: SaveCounter) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(saveCounter) as T
        }
    }

}