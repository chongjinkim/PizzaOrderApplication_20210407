package com.nepplus.pizzaorderapplication_20210407.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.nepplus.pizzaorderapplication_20210407.R
import com.nepplus.pizzaorderapplication_20210407.datas.Store

class PizzaStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inflater.inflate(R.layout.store_list_item, null)
        }

        val row = tempRow!!

        val storeData = mList[position]

        val storeTxt = row.findViewById<TextView>(R.id.storeNameTxt)
        val storeImg = row.findViewById<ImageView>(R.id.logoImg)

        storeTxt.text = storeData.name
        Glide.with(mContext).load(storeData.logoURL).into(storeImg)


        return row
    }
}