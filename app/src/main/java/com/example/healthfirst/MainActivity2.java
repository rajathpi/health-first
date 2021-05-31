package com.example.healthfirst;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity
{
    ListView lv;
    Context context;
    ArrayList progList;
    MyListAdapter adapter;
    static public boolean active = false;

    public  static  Integer[] progImages=
    {
            R.drawable.anchovy1,
            R.drawable.carp1,
            R.drawable.chicken1,
            R.drawable.clam1,
            R.drawable.cod1,
            R.drawable.crab1,
            R.drawable.egg1,
            R.drawable.flyingfish1,
            R.drawable.galjoen1,
            R.drawable.lobster1,
            R.drawable.mackerel1,
            R.drawable.marlin1,
            R.drawable.mussel1,
            R.drawable.mutton1,
            R.drawable.pork1,
            R.drawable.salmon1,
            R.drawable.sardines1,
            R.drawable.seaurchin1,
            R.drawable.shrimp1,
            R.drawable.squid1,
            R.drawable.trout1,
            R.drawable.tuna1,
            R.drawable.turkey1,
            R.drawable.whole1

    };

    public static  String[] progNames=
    {
            "Anchovy fish",
            "Carp fish",
            "Chicken",
            "Clam",
            "Cod fish",
            "Crab",
            "Egg white",
            "Flying fish",
            "Galjoen fish",
            "Lobster",
            "Mackerel",
            "Marlin fish",
            "Mussel",
            "Mutton",
            "Pork",
            "Salmon",
            "Sardines",
            "Sea urchin",
            "Shrimp",
            "Squid",
            "Trout",
            "Tuna",
            "Turkey",
            "Whole egg"
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem=menu.findItem(R.id.searchview);
        SearchView searchView=(SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener()
        {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id=item.getItemId();
        if(id== R.id.searchview)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        active = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        active = false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        List<FoodItems> foodItems = new ArrayList<>();

        for(int i = 0 ; i < progNames.length; i++)
        {
            foodItems.add(new FoodItems(progNames[i],progImages[i]));
        }

        adapter=new MyListAdapter(this,foodItems);
        lv=(ListView)findViewById(R.id.listview2);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                TextView foodname = (TextView)view.findViewById(R.id.FoodItemName);

                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                intent.putExtra("foodname",foodname.getText().toString());
                intent.putExtra("VegValue", true);
                startActivity(intent);
            }
        });
    }
}