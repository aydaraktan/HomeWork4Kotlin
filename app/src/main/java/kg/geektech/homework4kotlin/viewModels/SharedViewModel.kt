package kg.geektech.homework4kotlin.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

     private var mCounter = 0

      private val forSymbol = mutableListOf<String>()

     val counter = MutableLiveData<Int>()

     val plus = MutableLiveData<MutableList<String>>()

    fun onIncrementClick(){
        mCounter++
        counter.value = mCounter

        forSymbol.add("+\n")

        plus.value = forSymbol
    }

    fun onDecrementClick(){
        mCounter--
        counter.value = mCounter

        forSymbol.add("-\n")
        plus.value = forSymbol
    }
}

