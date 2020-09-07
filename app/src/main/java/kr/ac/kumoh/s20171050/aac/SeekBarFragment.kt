package kr.ac.kumoh.s20171050.aac


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
//import androidx.lifecycle.ViewModelProviders
import kr.ac.kumoh.s20171050.aac.databinding.FragmentSeekBarBinding

/**
 * A simple [Fragment] subclass.
 */
class SeekBarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seek_bar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewmodel:ShareViewModel = ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory()).get(ShareViewModel::class.java)
        // val viewmodel2:ShareViewModel = ViewModelProviders.of(requireActivity()).get(ShareViewModel::class.java)는 deprecated
        // this나 getActivity()(=activity)는 null일 수도 있으니 최근에 생긴 requireActivity() 사용하는게 좋음


        val binding: FragmentSeekBarBinding =  DataBindingUtil.bind<FragmentSeekBarBinding>(view)!!
        binding.lifecycleOwner = requireActivity()
        binding.shareViewmodel = viewmodel

        binding.seekbar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                viewmodel.progress.value=p1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        /* 데이터바인딩으로 필요없어짐 */
        // viewmodel.progress.observe(requireActivity(), Observer {
        //     binding.seekbar.progress = it
        // } )
    }
}
