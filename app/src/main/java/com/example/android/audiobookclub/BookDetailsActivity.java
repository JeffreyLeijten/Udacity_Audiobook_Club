package com.example.android.audiobookclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.android.audiobookclub.R.string.friends;

public class BookDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        Button library = (Button) findViewById(R.id.library_button);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(BookDetailsActivity.this, MainActivity.class);
                startActivity(libraryIntent);
            }
        });

        Button nowPlaying = (Button) findViewById(R.id.now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(BookDetailsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        Button store = (Button) findViewById(R.id.store_button);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(BookDetailsActivity.this, StoreActivity.class);
                startActivity(storeIntent);
            }
        });

        Button friendDetails = (Button) findViewById(R.id.friend_details_button);
        friendDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent friendDetailsIntent = new Intent(BookDetailsActivity.this, FriendDetailsActivity.class);
                startActivity(friendDetailsIntent);
            }
        });
    }
}
