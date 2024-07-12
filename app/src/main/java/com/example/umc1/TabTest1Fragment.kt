package com.example.umc1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc1.databinding.FragmentConfigBinding
import com.example.umc1.databinding.FragmentHomeBinding
import com.example.umc1.databinding.FragmentTabTest1Binding

class TabTest1Fragment : Fragment(){

    lateinit var binding: FragmentTabTest1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTabTest1Binding.inflate(inflater, container, false)

        return binding.root
    }

}