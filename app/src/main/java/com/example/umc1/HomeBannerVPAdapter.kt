package com.example.umc1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeBannerVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 1

    override fun createFragment(position: Int): Fragment{
        return when(position) {
            0 -> HomeBanne1rFragment()
            else -> HomeBanner2Fragment()
        }
    }
}