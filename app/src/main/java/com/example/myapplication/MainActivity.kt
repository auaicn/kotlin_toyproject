package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    var items = arrayListOf<Item>(
        Item(0,"ponyo"),
        Item(2,"ponyo"),
        Item(4,"ponyo"),
        Item(3,"ponyo"),
        Item(5,"ponyo"),
        Item(1,"ponyo"),
        Item(7,"ponyo"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recycle);
        var adapter = Adapter(getApplicationContext(), items)

        var layoutManager = GridLayoutManager(getApplicationContext(), 6);

//        layoutManager.setSpanSizeLookup(SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                int gridPosition = position % 5;
//                switch (gridPosition) {
//                    case 0:
//                    case 1:
//                    case 2:
//                    return 2;
//                    case 3:
//                    case 4:
//                    return 3;
//                }
//                return 0;
//            }
//        });

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, Fragment1())
                .commit()
        }
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, Fragment2())
                .commit()
        }
        btn3.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.view, Fragment3())
                .commit()
        }


        /*
                recyclerView = (RecyclerView)findViewById(R.id.grid_recyclerview);
        adapter = new RecyclerVIewAdapter(getApplicationContext(), list);

        layoutManager = new GridLayoutManager(getApplicationContext(), 6);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int gridPosition = position % 5;
                switch (gridPosition) {
                    case 0:
                    case 1:
                    case 2:
                        return 2;
                    case 3:
                    case 4:
                        return 3;
                }
                return 0;
            }
        });

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
[출처] (안드로이드/Android) 그리드 리사이클러뷰 사용하기|작성자 개발하는 친구


         */
    }

}
