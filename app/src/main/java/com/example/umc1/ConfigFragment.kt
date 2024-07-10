package com.example.umc1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.umc1.databinding.FragmentConfigBinding
import com.example.umc1.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class ConfigFragment : Fragment(){

    lateinit var binding: FragmentConfigBinding

    private val contents = arrayListOf("test1", "test2")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfigBinding.inflate(inflater, container, false)

        val vpAdapter = ConfigVPAdapter(this)
        binding.configVp.adapter = vpAdapter

        TabLayoutMediator(binding.configTab,binding.configVp){
            tab,position ->
            tab.text = contents[position]
        }.attach()

        return binding.root
    }

}