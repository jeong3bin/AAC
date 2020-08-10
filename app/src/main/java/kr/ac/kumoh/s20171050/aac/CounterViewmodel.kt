package kr.ac.kumoh.s20171050.aac

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewmodel : ViewModel() {

    var counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun increase(){
        counter.value=counter.value?.plus(1)
    }

    fun decrease(){
        counter.value=counter.value?.minus(1)
    }

}