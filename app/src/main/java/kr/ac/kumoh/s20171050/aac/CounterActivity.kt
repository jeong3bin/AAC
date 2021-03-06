package kr.ac.kumoh.s20171050.aac

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kr.ac.kumoh.s20171050.aac.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val viewmodel: CounterViewmodel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        ).get(CounterViewmodel::class.java)

        val binding: ActivityCounterBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_counter)

        binding.lifecycleOwner = this

        binding.viewmodel = viewmodel
    }

}