package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FriSemiVegFood extends AppCompatActivity {
    public RecyclerView recyclerView;
    public ArrayList<Modal> datalist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fri_semi_veg_food);
        recyclerView=findViewById(R.id.rv);

        datalist=new ArrayList<>();

        datalist.add(new Modal(R.drawable.watermelon1,"Watermelon"));
        datalist.add(new Modal(R.drawable.almond1,"Almond"));
        datalist.add(new Modal(R.drawable.blueberry1,"Blueberry"));
        datalist.add(new Modal(R.drawable.cherry1,"Cherry"));
        datalist.add(new Modal(R.drawable.salmon1,"Salmons"));
        datalist.add(new Modal(R.drawable.chicken1,"Chicken"));

        //datalist.add(new Modal(R.drawable.mobile));




        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,datalist);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}