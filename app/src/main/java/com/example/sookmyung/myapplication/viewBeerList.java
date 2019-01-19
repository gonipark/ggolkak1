package com.example.sookmyung.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class viewBeerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_beer_list);
        ListView listView=(ListView)findViewById(R.id.listview);
        ArrayList<Listviewitem> data=new ArrayList<>();
        Listviewitem lion=new Listviewitem(R.drawable.hogarden, "hogarden");
        //  Listviewitem tiger=new Listviewitem(R.drawable.tiger,"Tiger");
        //Listviewitem dog=new Listviewitem(R.drawable.dog,"Dog");
        //Listviewitem cat=new Listviewitem(R.drawable.cat,"Cat");
        data.add(lion);
        //data.add(tiger);
        // data.add(dog);
        // data.add(cat);
        ListviewAdapter adapter=new ListviewAdapter(this,R.layout.item,data);
        listView.setAdapter(adapter);
    }
    }







