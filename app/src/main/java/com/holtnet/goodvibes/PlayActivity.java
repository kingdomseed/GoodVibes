package com.holtnet.goodvibes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 66;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        TextView libraryTextView = findViewById(R.id.LibraryButton);

        libraryTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(PlayActivity.this, LibraryActivity.class);

                startActivityForResult(libraryIntent, REQUEST_CODE);
            }
        });

        TextView discoverTextView = findViewById(R.id.DiscoverButton);

        discoverTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent discoverIntent = new Intent(PlayActivity.this, DiscoverActivity.class);

                startActivity(discoverIntent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {

            Song song = data.getParcelableExtra("songDataToPass");

            TextView songTextView = findViewById(R.id.SongName);
            String songName = song.getmSongName();
            songTextView.setText(songName); // THIS LINE DOES NOT WORK

            // THIS TOAST WORKS IF I DON'T TRY AND USE SETTEXT ON LINE 51
            Toast.makeText(PlayActivity.this, songName, Toast.LENGTH_SHORT).show();
        }
    }
}
