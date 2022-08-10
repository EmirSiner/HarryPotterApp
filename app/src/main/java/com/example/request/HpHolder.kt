package com.example.request

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.harrypotterapp.R
import com.example.retrofit.HpCharacterResult

class HpHolder(holderView: View) : RecyclerView.ViewHolder(holderView) {
    fun bind(hpText: HpCharacterResult,hpItemListener: HpListener){
        val hptwName=itemView.findViewById<TextView>(R.id.twName)
        val hptwGender=itemView.findViewById<TextView>(R.id.twGender)
        val hptwDateBirth=itemView.findViewById<TextView>(R.id.twDateBirth)
        val hptwHouse=itemView.findViewById<TextView>(R.id.twHouse)
        val hptwAncestry=itemView.findViewById<TextView>(R.id.twAncestry)
    }


}