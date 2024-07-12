package com.example.umc1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.umc1.databinding.FragmentShopBinding

class ShopFragment : Fragment(){
    lateinit var binding: FragmentShopBinding
    private lateinit var adapter:ShopRVAdapter

    val shopDatas = ArrayList<ShopData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShopBinding.inflate(inflater, container, false)

        initializeshoplist()
        initShopRecyclerView()

        return binding.root
    }

    fun initShopRecyclerView(){
        val adapter = ShopRVAdapter()
        adapter.shoplist = shopDatas
        binding.shopShoplistRv.adapter=adapter
        binding.shopShoplistRv.layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    fun initializeshoplist(){
        with(shopDatas){
            add(ShopData(R.drawable.pencil_alt,"제목1", "내용1"))
            add(ShopData(R.drawable.cog,"제목2", "내용2"))
            add(ShopData(R.drawable.home,"제목3", "내용3"))
            add(ShopData(R.drawable.gift,"제목4", "내용4"))
            add(ShopData(R.drawable.pencil_alt,"제목5", "내용1"))
            add(ShopData(R.drawable.pencil_alt,"제목6", "내용1"))

        }
    }


}