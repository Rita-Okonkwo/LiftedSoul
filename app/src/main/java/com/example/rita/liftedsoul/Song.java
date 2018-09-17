package com.example.rita.liftedsoul;

public class Song {
    private String mSongName;
    private String mArtistName;

    //To get the construcror
    public Song(String song, String artist){
        mSongName =  song;
        mArtistName = artist;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }
}
