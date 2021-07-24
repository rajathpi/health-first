package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

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
        setContentView(R.layout.activity_main8);

        //NO TITLE
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        //NO TITLE

        Monday = findViewById(R.id.button1);
        Tuesday = findViewById(R.id.button2);
        Wednesday = findViewById(R.id.button3);
        Thursday = findViewById(R.id.button4);
        Friday = findViewById(R.id.button5);
        Saturday = findViewById(R.id.button6);
        Sunday = findViewById(R.id.button7);


        //When button is clicked -> we pass a value to Activity10 so that we plot the right graph for the right day
        Monday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, MainActivity10.class);
                x.putExtra("nums","1");
                startActivity(x);
            }
        });

        Tuesday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, vegTuesday.class);
                x.putExtra("nums","2");
                startActivity(x);
            }
        });

        Wednesday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, vegWednesday.class);
                x.putExtra("nums","3");
                startActivity(x);
            }
        });

        Thursday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, vegThursday.class);
                x.putExtra("nums","4");
                startActivity(x);
            }
        });

        Friday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, vegFriday.class);
                x.putExtra("nums","5");
                startActivity(x);
            }
        });

        Saturday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, vegSaturday.class);
                x.putExtra("nums","6");
                startActivity(x);
            }
        });

        Sunday.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity8.this, vegSunday.class);
                x.putExtra("nums","7");
                startActivity(x);
            }
        });
    }
}