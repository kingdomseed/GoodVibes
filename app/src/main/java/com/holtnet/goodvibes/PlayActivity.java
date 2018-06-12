package com.holtnet.goodvibes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PlayActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 66;
    private Song song;

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

        TextView shareTextView = findViewById(R.id.ShareButton);

        shareTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Select a song from the library first.", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK && requestCode == REQUEST_CODE) {

            song = data.getParcelableExtra("songDataToPass");

            TextView songTextView = findViewById(R.id.SongTitle);
            songTextView.setText(song.getmSongName());

            TextView albumTextView = findViewById(R.id.AlbumTitle);
            albumTextView.setText(song.getmAlbumName());

            TextView artistTextView = findViewById(R.id.ArtistName);
            artistTextView.setText(song.getmArtistName());

            ImageView albumArtImageView = findViewById(R.id.PlayingAlbumArt);
            albumArtImageView.setImageResource(song.getmAlbumArt());

            TextView shareTextView = findViewById(R.id.ShareButton);
            shareTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT, song.toString());
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                }
            });
        }
    }
}
