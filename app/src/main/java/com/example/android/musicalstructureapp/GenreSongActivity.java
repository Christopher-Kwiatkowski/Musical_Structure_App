package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GenreSongActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Don\'t Stop Believin\'", "Journey", "Classic Rock"));
        songs.add(new Song("Any Way You Want It", "Journey", "Classic Rock"));
        songs.add(new Song("Riders On The Storm", "The Doors", "Classic Rock"));
        songs.add(new Song("L.A. Woman", "The Doors", "Classic Rock"));
        songs.add(new Song("Roar", "Katy Perry", "Pop"));
        songs.add(new Song("Bad Guy","Billie Eilish", "Pop"));
        songs.add(new Song("Changes","Tupac Shakur", "Rap"));
        songs.add(new Song("Lose Yourself","Eminem", "Rap"));
        songs.add(new Song("Fur Elise","Beethoven", "Classical"));
        songs.add(new Song("The Four Seasons","Vivaldi", "Classical"));

        Intent intent = getIntent();
        String genre = intent.getExtras().getString("genre");
        ArrayList<Song> genreSongs = new ArrayList<Song>();

        for(Song song: songs) {
            if(song.getGenre().equals(genre)) {
                genreSongs.add(song);
            }
        }
            SongAdapter itemsAdapter = new SongAdapter(this, genreSongs);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(itemsAdapter);
    }
}