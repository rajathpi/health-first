package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity3 extends AppCompatActivity {
    ListView lv;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lv = (ListView)findViewById(R.id.listview1);

        final String values[]= new String[]{"Carrot", "Onion", "Raddish", "Spinach","Cucumber","Tomato","Potato","Paneer","Neem leaves","Mushroom","DrumStick","Beans","Garlic"};

        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity3.this,"You clicked:"+values[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}