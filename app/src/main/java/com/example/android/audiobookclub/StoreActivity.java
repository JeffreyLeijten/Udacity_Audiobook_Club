package com.example.android.audiobookclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        Button library = (Button) findViewById(R.id.library_button);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(StoreActivity.this, MainActivity.class);
                startActivity(libraryIntent);
                finish();
            }
        });

        Button bookDetails = (Button) findViewById(R.id.book_details_button);
        bookDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookDetailsIntent = new Intent(StoreActivity.this, BookDetailsActivity.class);
                startActivity(bookDetailsIntent);
                finish();
            }
        });
    }
}
