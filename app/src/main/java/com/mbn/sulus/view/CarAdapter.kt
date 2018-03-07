package com.mbn.sulus.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mbn.sulus.R
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

/**
 * Created by jonathan on 4/03/18.
 */

class CarAdapter(val dataList: List<Data>) : RecyclerView.Adapter<CarAdapter.Holder>(){
    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.binView(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder =
            Holder(ItemList().createView(AnkoContext.Companion.create(parent!!.context,this, false)))

    class Holder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtViewTitle by lazy {
            itemView.find<TextView>(R.id.itemTitle)
        }
        val txtViewDesc by lazy {
            itemView.find<TextView>(R.id.itemDesc)
        }
        val txtViewPrice by lazy {
            itemView.find<TextView>(R.id.itemPrice)
        }
        fun binView(item: Data) {
            with(item) {
                txtViewTitle.text = item.titulo
                txtViewDesc.text = item.desc
                txtViewPrice.text = item.price
            }
        }
    }
}