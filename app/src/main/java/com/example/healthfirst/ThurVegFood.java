package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ThurVegFood extends AppCompatActivity {
    public RecyclerView recyclerView;
    public ArrayList<Modal> datalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thur_veg_food);
        recyclerView=findViewById(R.id.rv);

        datalist=new ArrayList<>();

        datalist.add(new Modal(R.drawable.plum1,"Plum "));
        datalist.add(new Modal(R.drawable.star1,"Star fruit"));
        datalist.add(new Modal(R.drawable.raspberry1,"Rasberry"));
        datalist.add(new Modal(R.drawable.carrot1,"Carrot"));

        //datalist.add(new Modal(R.drawable.mobile));




        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,datalist);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}