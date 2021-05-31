package com.example.healthfirst;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.TelecomManager;
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

public class MainActivity3 extends AppCompatActivity
{
    ListView lv;
    Context context;
    ArrayList progList;
    MyListAdapter adapter;
    static public boolean active = false;

    public  static  String[] progNames=
            {
                    "Almond",
                    "Apple",
                    "Apricot",
                    "Artichoke",
                    "Arugula",
                    "Avocado",
                    "Banana flower",
                    "Banana",
                    "Beet",
                    "Bell Pepper",
                    "Bok choy",
                    "Broccoli",
                    "Cabbage",
                    "Carrot",
                    "Cauliflower",
                    "Cherry",
                    "Chili",
                    "Coconut",
                    "Corn",
                    "Cucumber",
                    "Dragon fruit",
                    "Durian",
                    "Eggplant",
                    "Fig",
                    "Garlic",
                    "Ginger",
                    "Ginkgo",
                    "Grapes",
                    "Guava",
                    "Kale",
                    "Kiwi",
                    "Leek",
                    "Lemon",
                    "Lettuce",
                    "Macadamia nut",
                    "Mache",
                    "Mango",
                    "Milk",
                    "Mushroom",
                    "Okra",
                    "Olives",
                    "Onion",
                    "Orange",
                    "Papaya",
                    "Parsley",
                    "Passion fruit",
                    "Peach",
                    "Peanut",
                    "Pear",
                    "Peas",
                    "Pepper",
                    "Pineapple",
                    "Plum",
                    "Pomegranate",
                    "Potato",
                    "Pumpkin",
                    "Radish",
                    "Raspberry",
                    "Spinach",
                    "Starfruit",
                    "Strawberry",
                    "Tomato",
                    "Turnip",
                    "Walnut",
                    "Water cress",
                    "Watermelon",
            };

    public  static  Integer[] progImages=
            {
                    R.drawable.almond1,
                    R.drawable.apple1,
                    R.drawable.apricot1,
                    R.drawable.artichoke,
                    R.drawable.arugula,
                    R.drawable.avocado1,
                    R.drawable.bananaflower,
                    R.drawable.bananas1,
                    R.drawable.beet,
                    R.drawable.bellpepper,
                    R.drawable.bokchoy,
                    R.drawable.broccoli,
                    R.drawable.cabbage2,
                    R.drawable.carrot1,
                    R.drawable.cauliflower1,
                    R.drawable.cherry1,
                    R.drawable.chili,
                    R.drawable.coconut1,
                    R.drawable.corn1,
                    R.drawable.cucumber1,
                    R.drawable.dragon1,
                    R.drawable.durian1,
                    R.drawable.eggplant1,
                    R.drawable.fig1,
                    R.drawable.garlic1,
                    R.drawable.ginger,
                    R.drawable.ginkgo2,
                    R.drawable.grape1,
                    R.drawable.guava1,
                    R.drawable.kale,
                    R.drawable.kiwi1,
                    R.drawable.leek,
                    R.drawable.lemon1,
                    R.drawable.lettuce1,
                    R.drawable.macadamianut,
                    R.drawable.mache,
                    R.drawable.mango1,
                    R.drawable.milk,
                    R.drawable.mushrooms1,
                    R.drawable.okra,
                    R.drawable.olives,
                    R.drawable.onion1,
                    R.drawable.orange2,
                    R.drawable.papaya1,
                    R.drawable.parsley,
                    R.drawable.passion1,
                    R.drawable.peach1,
                    R.drawable.peanut,
                    R.drawable.pear1,
                    R.drawable.peas1,
                    R.drawable.pepper,
                    R.drawable.pineapple1,
                    R.drawable.plum1,
                    R.drawable.pomegranate1,
                    R.drawable.potato1,
                    R.drawable.pumpkin1,
                    R.drawable.radish1,
                    R.drawable.raspberry1,
                    R.drawable.spinach1,
                    R.drawable.star1,
                    R.drawable.strawberry1,
                    R.drawable.tomato1,
                    R.drawable.turnip1,
                    R.drawable.walnut,
                    R.drawable.watercress,
                    R.drawable.watermelon1,
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
        setContentView(R.layout.activity_main3);
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

                Intent intent = new Intent(MainActivity3.this, MainActivity5.class);
                intent.putExtra("foodname",foodname.getText().toString());
                intent.putExtra("VegValue", true);
                startActivity(intent);
            }
        });

    }
}