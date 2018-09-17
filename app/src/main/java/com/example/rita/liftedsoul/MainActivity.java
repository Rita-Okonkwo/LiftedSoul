package com.example.rita.liftedsoul;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//find view that shows the all songs category
        TextView songs = (TextView) findViewById(R.id.songs);

        //set a click listener on it
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songIntent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(songIntent);
            }

        });

        //find view that shows recently added
        TextView recent = (TextView) findViewById(R.id.recent);
        recent.setOnClickListener(new View.OnClickListener() {   //set on click listener
            @Override
            public void onClick(View v) {
                Intent recentIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentIntent);
            }
        });

        //find view that shows most played
        TextView play = (TextView) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {   //set on click listener
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }
        });

        //find view that shows my favorites
        TextView favorite = (TextView) findViewById(R.id.favorite);
        favorite.setOnClickListener(new View.OnClickListener() {   //set on click listener
            @Override
            public void onClick(View v) {
                Intent favoriteIntent = new Intent(MainActivity.this, FavoriteActivity.class);
                startActivity(favoriteIntent);
            }
        });
    }
}      







