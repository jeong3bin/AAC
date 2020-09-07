package kr.ac.kumoh.s20171050.aac

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShareViewModel : ViewModel() {
    var progress: MutableLiveData<Int> = MutableLiveData()

    init {
        progress.value = 0
    }


}