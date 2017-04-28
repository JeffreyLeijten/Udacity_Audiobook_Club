package com.example.android.audiobookclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FriendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        Button library = (Button) findViewById(R.id.library_button);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(FriendsActivity.this, MainActivity.class);
                startActivity(libraryIntent);
            }
        });

        Button friendDetails = (Button) findViewById(R.id.friend_details_button);
        friendDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent friendDetailsIntent = new Intent(FriendsActivity.this, FriendDetailsActivity.class);
                startActivity(friendDetailsIntent);
            }
        });
    }
}
