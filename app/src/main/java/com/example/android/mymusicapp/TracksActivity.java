package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        TextView tracksToFavorites =  findViewById(R.id.toOtherActivityButton);
        tracksToFavorites.setText(R.string.toFavorites);


        tracksToFavorites.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent favoritesIntent = new Intent(TracksActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });


        ArrayList<items> items = new ArrayList<>();


        items.add(new items("Havana", "Camila Cabello"));
        items.add(new items("We Don't Talk Anymore","Charlie Puth"));
        items.add(new items("How Long","Charlie Puth"));
        items.add(new items("Dangerously","Charlie Puth"));
        items.add(new items("One Call Away","Charlie Puth"));
        items.add(new items("The Greatest","Sia"));
        items.add(new items("Alive","Sia"));
        items.add(new items("Elastic Heart feat","Sia"));
        items.add(new items("Somebody That I Used To Know","Gotye"));
        items.add(new items("Royals","Lorde"));
        items.add(new items("Cups","Anna Kendrick"));
        items.add(new items("Fight Song","Rachel Platten"));
        items.add(new items("Wide Awake","Katy Perry"));


        ItemsAdapter adapter = new ItemsAdapter(this, items);

        ListView listView =  findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
