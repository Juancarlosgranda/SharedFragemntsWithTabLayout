package com.juancarlos.tabbedapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.util.Log


class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()

    fun setIndex(index: Int) {
        _index.value = index
    }
    private val mName = MutableLiveData<String>()


    fun setName(name: String) {
        mName.value = name
        setIndex(name.length)
        Log.d("cuack","setName: ${mName.value} ")
    }

    fun getName(): LiveData<String> {
        Log.d("cuack","getName: ${mName.value} ")
        return mName
    }
}