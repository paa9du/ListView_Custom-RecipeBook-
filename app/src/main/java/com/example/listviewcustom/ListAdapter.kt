package com.example.listviewcustom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(context: Context, dataArrayList: ArrayList<Listdata?>?) :
    ArrayAdapter<Listdata?>(context, R.layout.list_item, dataArrayList!!) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var view = view
        val listdata = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        }
        val listImage = view!!.findViewById<ImageView>(R.id.listImage)
        val listName = view.findViewById<TextView>(R.id.listName)
        val listTime = view.findViewById<TextView>(R.id.listTime)
        listImage.setImageResource(listdata!!.Image)
        if (listdata != null) {
            listName.text = listdata.name
        }
        if (listdata != null) {
            listTime.text = listdata.time
        }
        return view
    }
}