package com.example.android.mymusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manar on 22/12/2017.
 */

public class itemsAdapter extends ArrayAdapter<items> {

    public itemsAdapter(Activity context, ArrayList<items>item){
        super(context,0,item);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {


        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_list_item, parent, false);
        }


        items currentItems = getItem(position);


        TextView songOrPlaylistName = (TextView) listItemView.findViewById(R.id.songName);
        songOrPlaylistName.setText(currentItems.getmSongName());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artistName);
        defaultTextView.setText(currentItems.getmArtistName());


        return listItemView;

    }
}
