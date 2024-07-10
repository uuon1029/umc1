package com.example.umc1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ConfigVPAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment{
        return when(position) {
            0 -> TabTest1Fragment()
            else -> TabTest2Fragment()
        }
    }
}