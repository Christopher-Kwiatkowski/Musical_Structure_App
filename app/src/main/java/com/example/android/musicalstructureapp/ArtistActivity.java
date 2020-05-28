package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        ArrayList<String> artists = new ArrayList<String>();
        artists.add("Journey");
        artists.add("The Doors");
        artists.add("Katy Perry");
        artists.add("Billie Eilish");
        artists.add("Tupac Shakur");
        artists.add("Eminem");
        artists.add("Beethoven");
        artists.add("Vivaldi");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, artists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3)
            {
                String value = (String)adapter.getItemAtPosition(position);

                Intent artistSongIntent = new Intent(ArtistActivity.this, ArtistSongActivity.class);
                artistSongIntent.putExtra("artist", value);

                startActivity(artistSongIntent);
            }
        });

        listView.setAdapter(itemsAdapter);
    }
}