package com.example.umc1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc1.databinding.FragmentHomeBanner1Binding
import com.example.umc1.databinding.FragmentHomeBanner2Binding

class HomeBanner2Fragment : Fragment() {
    lateinit var binding : FragmentHomeBanner2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBanner2Binding.inflate(inflater,container,false)

        return binding.root
    }
}