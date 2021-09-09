package com.example.bai3_buoi4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv ;
    ArrayList<Data> arrayList;
    RecyclerDataAdapter recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        arrayList = new ArrayList<>();
        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"Video"));
        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"Android"));
        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"Applock"));
        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"Books"));
        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"map"));


        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"New Folder"));
        arrayList.add(new Data(R.drawable.ic_rectange1,R.drawable.ic_but,R.drawable.ic_hinhtron,R.drawable.ic_daux,R.drawable.ic_line,"New Folder1"));
        recycle = new RecyclerDataAdapter(arrayList,this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        rv.setAdapter(recycle);
        rv.setLayoutManager(linearLayoutManager);

    }
}