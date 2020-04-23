package com.example.navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card.view.*

class buddhismAdapter(val places:List<place>):RecyclerView.Adapter<buddhismAdapter.placeholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): placeholder {
        return placeholder(
            LayoutInflater.from(parent.context).inflate(R.layout.card,parent,false))
    }

    override fun getItemCount()=places.size

    override fun onBindViewHolder(holder: placeholder, position: Int) {
        val place=places[position]
        holder.view.textViewDay.text=place.duration
        holder.view.textViewShortDesc.text=place.description
        holder.view.textViewTitle.text=place.name

    }

    class placeholder(val view: View):RecyclerView.ViewHolder(view)
}