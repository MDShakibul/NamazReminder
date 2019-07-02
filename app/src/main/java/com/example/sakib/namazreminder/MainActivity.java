package com.example.sakib.namazreminder;


import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button fajr;
    Button dhuhr;
    Button asr;
    Button maghrib;
    Button isha;
    Button jumma;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fajr = (Button) findViewById(R.id.button11);
        dhuhr = (Button) findViewById(R.id.button14);
        asr = (Button) findViewById(R.id.button12);
        maghrib = (Button) findViewById(R.id.button19);
        isha = (Button) findViewById(R.id.button13);
        jumma = (Button) findViewById(R.id.button18);

        fajr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this,
                        fajr.class);
                startActivity(myIntent);
            }
        });
        dhuhr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this,Dhuhr.class);
                startActivity(myIntent);
            }
        });
        asr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this,asr.class);
                startActivity(myIntent);
            }
        });
        maghrib.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this,maghrib.class);
                startActivity(myIntent);
            }
        });
        isha.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this,isha.class);
                startActivity(myIntent);
            }
        });
        jumma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                Intent myIntent = new Intent(MainActivity.this,jumma.class);
                startActivity(myIntent);
            }
        });

    }



}
