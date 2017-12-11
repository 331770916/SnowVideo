package com.example.fanlinlin.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView1 = (RecyclerView) findViewById(R.id.recylerView1);
        LinearLayoutManager ms= new LinearLayoutManager(this);
        ms.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(ms);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recylerView2);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 10);

//        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                if ("tradGirde".equals((String) data.get(position))) {
//                    return 1;
//                } else {
//                    return 4;
//                }
//            }
//        });

        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);


        recyclerView.setLayoutManager(gridLayoutManager);
        CustomAdapter adapter = new CustomAdapter(this);
        CustomAdapter adapter1 = new CustomAdapter(this);

        recyclerView.setAdapter(adapter);
        recyclerView1.setAdapter(adapter1);

        List<String> data = new ArrayList<>();
        for (int i =0; i< 150; i++) {
            String str = "str" + i;
            data.add(str);
        }
        adapter.setDatas(data);

        List<String> data1 = new ArrayList<>();
        for (int i =0; i< 10; i++) {
            String str = "str" + i;
            data1.add(str);
        }
        adapter1.setDatas(data1);
    }
}
