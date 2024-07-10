package com.example.umc1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc1.databinding.FragmentConfigBinding
import com.example.umc1.databinding.FragmentHomeBinding
import com.example.umc1.databinding.FragmentTabTest2Binding

class TabTest2Fragment : Fragment(){

    lateinit var binding: FragmentTabTest2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabTest2Binding.inflate(inflater, container, false)

        return binding.root
    }

}