package com.example.healthfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MainActivity7 extends AppCompatActivity {

    ImageButton i5;
    ImageButton i6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        //NO TITLE
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        //NO TITLE

        i5 = (ImageButton) findViewById(R.id.imageButton5);
        i6 = (ImageButton) findViewById(R.id.imageButton6);

        i5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent x = new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(x);
            }
        });

        i6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent x = new Intent(MainActivity7.this, MainActivity9.class);
                startActivity(x);
            }
        });
    }
}