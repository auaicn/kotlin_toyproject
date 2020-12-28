package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager

class Fragment1 : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myLayoutManager = GridLayoutManager(this, 2)
        val myRecyclerView = null
        myRecyclerView.layoutManager = myLayoutManager
        return inflater.inflate(R.layout.fragment1, container, false)

    }

}
