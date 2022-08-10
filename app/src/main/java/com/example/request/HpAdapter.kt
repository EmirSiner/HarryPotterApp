package com.example.request

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotterapp.R
import com.example.retrofit.HpCharacterResult

class HpAdapter(val hpItemListener: HpListener) : RecyclerView.Adapter<HpHolder>() {
    private val rmItems = arrayListOf<HpCharacterResult>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HpHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val holderView = layoutInflater.inflate(R.layout.activity_hp_item, parent, false)
        return HpHolder(holderView)
    }

    override fun onBindViewHolder(holder: HpHolder, position: Int) {
        val rmText = rmItems[position]
        holder.bind(rmText, hpItemListener)
    }

    override fun getItemCount(): Int {
        return rmItems.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(rmst: List<HpCharacterResult>) {
        rmItems.clear()
        rmItems.addAll(rmst)
        notifyDataSetChanged()
    }


}