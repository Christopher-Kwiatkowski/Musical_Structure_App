package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GenreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        ArrayList<String> genres = new ArrayList<String>();
        genres.add("Classic Rock");
        genres.add("Pop");
        genres.add("Rap");
        genres.add("Classical");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, genres);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3)
            {
                String value = (String)adapter.getItemAtPosition(position);

                Intent genreSongIntent = new Intent(GenreActivity.this, GenreSongActivity.class);
                genreSongIntent.putExtra("genre", value);

                startActivity(genreSongIntent);
            }
        });

        listView.setAdapter(itemsAdapter);
    }
}