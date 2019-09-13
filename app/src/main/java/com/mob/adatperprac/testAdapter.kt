package com.mob.adatperprac

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class testAdapter (val context : Context, val testList: ArrayList<TestModel>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder : ViewHolder

        if(convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item, null)
            holder = ViewHolder()
            holder.text1 = view.findViewById<TextView>(R.id.text1)
            holder.text2 = view.findViewById<TextView>(R.id.text2)
            holder.text3 = view.findViewById<TextView>(R.id.text3)
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        val mData = testList[position]

        holder.text1?.text = mData.a
        holder.text2?.text = mData.b
        holder.text3?.text = mData.c

        return view
    }

    override fun getItem(position: Int): Any {
        return testList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return testList.size
    }
    private class ViewHolder {
        var text1 : TextView ?= null
        var text2 : TextView ?= null
        var text3 : TextView ?= null
    }
}