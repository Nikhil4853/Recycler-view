package com.example.recycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items:ArrayList<String>, private val lis:listner): RecyclerView.Adapter<viewHolderclass>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolderclass {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.newslistitem,parent,false)
       val viewHolder = viewHolderclass(view)
        view.setOnClickListener {
            lis.onclicked(items[viewHolder.adapterPosition])
        }
return viewHolder
    }

    override fun onBindViewHolder(holder: viewHolderclass, position: Int) {
val curentItem=items[position]
        holder.titleview.text=curentItem

    }

    override fun getItemCount(): Int {
       return items.size
    }

}
class viewHolderclass(itemView: View) : RecyclerView.ViewHolder(itemView) {
val titleview:TextView=itemView.findViewById(R.id.title)


}
interface listner{
    fun onclicked(item: String)
}