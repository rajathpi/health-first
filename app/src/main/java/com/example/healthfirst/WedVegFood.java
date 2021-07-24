package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class WedVegFood extends AppCompatActivity {
    public RecyclerView recyclerView;
    public ArrayList<Modal> datalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wed_veg_food);

        recyclerView=findViewById(R.id.rv);

        datalist=new ArrayList<>();

        datalist.add(new Modal(R.drawable.almond1,"Almonnd"));
        datalist.add(new Modal(R.drawable.cucumber1,"Cucumber"));
        datalist.add(new Modal(R.drawable.dragon1,"Dargon fruit"));
        datalist.add(new Modal(R.drawable.fig1,"Fig"));

        //datalist.add(new Modal(R.drawable.mobile));




        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,datalist);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}