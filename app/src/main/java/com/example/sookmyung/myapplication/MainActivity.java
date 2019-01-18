package com.example.sookmyung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button beerlist = (Button) findViewById(R.id.viewBeerList);
        Button beerscan = (Button) findViewById(R.id.scanBeer);
        Button arfri = (Button) findViewById(R.id.ar);
        Button beerstory = (Button) findViewById(R.id.myBeerStory);

        beerlist.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),viewBeerList.class);
                startActivity(intent);
            }
        });
        beerscan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),scanBeer.class);
                        startActivity(intent);
                    }
                });
        arfri.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),arfri.class);
                startActivity(intent);
            }
        });
        beerstory.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),myBeerStory.class);
                startActivity(intent);
            }
        });
    }
}