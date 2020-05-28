package com.example.android.musicalstructureapp;

public class Song {

    private String mSongTitle;

    private String mArtist;

    private String mGenre;

    public Song(String songTitle, String artist, String genre) {
        mSongTitle = songTitle;
        mArtist = artist;
        mGenre = genre;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getGenre() {
        return mGenre;
    }


}