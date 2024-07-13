package com.example.umc1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeBannerVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment{
        return when(position) {
            0 -> HomeBanner1Fragment()
            else -> HomeBanner2Fragment()
        }
    }
}