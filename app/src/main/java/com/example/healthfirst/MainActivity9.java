package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    Button Monday;
    Button Tuesday;
    Button Wednesday;
    Button Thursday;
    Button Friday;
    Button Saturday;
    Button Sunday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        //NO TITLE
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        //NO TITLE

        Monday = findViewById(R.id.button11);
        Tuesday = findViewById(R.id.button22);
        Wednesday = findViewById(R.id.button33);
        Thursday = findViewById(R.id.button44);
        Friday = findViewById(R.id.button55);
        Saturday = findViewById(R.id.button66);
        Sunday = findViewById(R.id.button77);

        //When button is clicked -> we pass a value to Activity10 so that we plot the right graph for the right day
        Monday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiMonday.class);
                x.putExtra("nums","11");
                startActivity(x);
            }
        });

        Tuesday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiTuesday.class);
                x.putExtra("nums","22");
                startActivity(x);
            }
        });

        Wednesday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiWednesday.class);
                x.putExtra("nums","33");
                startActivity(x);
            }
        });

        Thursday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiThursday.class);
                x.putExtra("nums","44");
                startActivity(x);
            }
        });

        Friday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiFriday.class);
                x.putExtra("nums","55");
                startActivity(x);
            }
        });

        Saturday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiSaturday.class);
                x.putExtra("nums","66");
                startActivity(x);
            }
        });

        Sunday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity9.this, semiSunday.class);
                x.putExtra("nums","77");
                startActivity(x);
            }
        });
    }
}