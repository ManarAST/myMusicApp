package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the tracks category
        TextView tracksButton = (TextView) findViewById(R.id.tracksButton);


        // Set a click listener on that View
        tracksButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the tracks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent tracksIntent = new Intent(MainActivity.this, TracksActivity.class);

                // Start the new activity
                startActivity(tracksIntent);
            }
        });

        // Find the View that shows the family category
        TextView favorites = (TextView) findViewById(R.id.favoriteButton);

        // Set a click listener on that View
        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override


            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);

                // Start the new activity
                startActivity(favoritesIntent);
            }
        });
    }
}
