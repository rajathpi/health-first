package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SunSemiVegFood extends AppCompatActivity {
    public RecyclerView recyclerView;
    public ArrayList<Modal> datalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sun_semi_veg_food);
        recyclerView=findViewById(R.id.rv);

        datalist=new ArrayList<>();

        datalist.add(new Modal(R.drawable.pineapple1,"Pineapple"));
        datalist.add(new Modal(R.drawable.passion1,"Passion fruit"));
        datalist.add(new Modal(R.drawable.pomegranate1,"Pomegranate"));
        datalist.add(new Modal(R.drawable.watermelon1,"Watermelon"));
        datalist.add(new Modal(R.drawable.pineapple1,"Pineapple"));
        datalist.add(new Modal(R.drawable.turkey1,"Turkey"));
        datalist.add(new Modal(R.drawable.shrimp1,"Shrimp"));


        //datalist.add(new Modal(R.drawable.mobile));




        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,datalist);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}