package com.example.rita.liftedsoul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Intentional", "Travis Greene"));
        songs.add(new Song("The Air I Breath", "Jerry K"));
        songs.add(new Song("Bianule", "Frank Edwards"));
        songs.add(new Song("Can't Live On My Ability", "Casting Crowns"));
        songs.add(new Song("Jesus Take The Wheel", "Carrie Underwood"));
        songs.add(new Song("Come Fill My Heart", "Cece Winans"));
        songs.add(new Song("Excess Love", "Mercy Chinwo"));
        songs.add(new Song("He's Able", "Darwin Hobbs"));
        songs.add(new Song("Imela", "Steve Crown"));
        songs.add(new Song("Jesus at the centre", "Eben"));
        songs.add(new Song("Lead Me To The Cross", "Hillsong"));
        songs.add(new Song("Made A Way", "Travis Greene"));
        songs.add(new Song("My World Needs You", "Kirk Franklin"));
        songs.add(new Song("Ome KaNnaya", "Mercy Chinwo"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.play_list);

        listView.setAdapter(adapter);

    }
}

