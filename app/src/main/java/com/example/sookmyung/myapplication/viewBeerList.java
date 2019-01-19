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


        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayList<Listviewitem> data = new ArrayList<>();
        Listviewitem hogarden = new Listviewitem(R.drawable.hogarden, "hogarden");
        Listviewitem budwiser = new Listviewitem(R.drawable.budwiser, "budwiser");
        Listviewitem guinness = new Listviewitem(R.drawable.guinness, "guinness");
        Listviewitem heineken = new Listviewitem(R.drawable.heineken, "heineken");
        Listviewitem kirin_ichiban = new Listviewitem(R.drawable.kirin_ichiban, "kirin ichiban");
        Listviewitem kozel = new Listviewitem(R.drawable.kozel, "kozel");
        Listviewitem tsingtao = new Listviewitem(R.drawable.tsingtao, "tsingtao");
        data.add(hogarden);
        data.add(budwiser);
        data.add(guinness);
        data.add(heineken);
        data.add(kirin_ichiban);
        data.add(kozel);
        data.add(tsingtao);

        ListviewAdapter adapter = new ListviewAdapter(this, R.layout.item, data);
        listView.setAdapter(adapter);


    }
}







