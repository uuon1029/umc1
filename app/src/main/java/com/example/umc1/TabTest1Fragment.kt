package com.example.umc1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc1.databinding.FragmentConfigBinding
import com.example.umc1.databinding.FragmentHomeBinding

class TabTest1Fragment : Fragment(){

    lateinit var binding: FragmentConfigBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfigBinding.inflate(inflater, container, false)

        return binding.root
    }

}