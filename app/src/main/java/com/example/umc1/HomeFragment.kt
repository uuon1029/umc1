package com.example.umc1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.umc1.databinding.FragmentHomeBinding
import java.util.Timer
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.concurrent.timer

class HomeFragment : Fragment(){

    private val timer = Timer()
    private val handler = Handler(Looper.getMainLooper())

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val bannerAdapter = BannerVPAdapter(this)
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp))
        bannerAdapter.addFragment(BannerFragment(R.drawable.img_home_viewpager_exp2))
        binding.homeBannerExpIv.adapter = bannerAdapter
        binding.homeBannerExpIv.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        startAutoslide(bannerAdapter)

        return binding.root
    }

    private fun startAutoslide(adapter : BannerVPAdapter){
        timer.scheduleAtFixedRate(6000, 3000){
            handler.post {
                val nextItem = binding.homeBannerIv.currentItem + 1

                if(nextItem < adapter.itemCount) {
                    binding.homeBannerExpIv.currentItem = nextItem
                } else {
                    binding.homeBannerIv.currentItem = 0
                }
            }

        }
    }
}