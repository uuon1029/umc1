package com.example.umc1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.umc1.databinding.ItemShopBinding

class ShopRVAdapter() : RecyclerView.Adapter<ShopRVAdapter.ViewHolder>(){
    var shoplist = ArrayList<ShopData>()

    inner class ViewHolder(private val binding: ItemShopBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(shopData: ShopData){
            binding.shopitemImageIv.setImageResource(shopData.coverImg!!)
            binding.shopitemTitleTv.text=shopData.shop_title
            binding.shopitemBodyTv.text=shopData.shop_body
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemShopBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int =shoplist.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(shoplist[position])
    }
}
