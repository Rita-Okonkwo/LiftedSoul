package com.example.rita.liftedsoul;

import android.content.Context;;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.list, parent, false);


        }

        Song currentSongAdapter = getItem(position);

        TextView song = (TextView) listItemView.findViewById(R.id.song_name);
        song.setText(currentSongAdapter.getmSongName());

        TextView artist = (TextView) listItemView.findViewById(R.id.artist);
        artist.setText(currentSongAdapter.getmArtistName());

        return listItemView;
    }
}



