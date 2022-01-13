package com.example.recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), listner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager=LinearLayoutManager(this)
        val item=fetchData()
        val adapter = NewsListAdapter(item,this)
        recyclerview.adapter=adapter
    }
    private  fun fetchData():ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 100){
            list.add("title ${i+1}")
        }
        return list
    }

    override fun onclicked(item: String) {
        Toast.makeText(applicationContext, "$item", Toast.LENGTH_SHORT).show()
    }
}