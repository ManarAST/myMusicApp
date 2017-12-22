package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tracksButton = findViewById(R.id.tracksButton);
        tracksButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(tracksIntent);
            }
        });


        TextView favorites = findViewById(R.id.favoriteButton);
        favorites.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }
        });
    }
}
