package com.holtnet.goodvibes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Adieu","Coeur de Pirate","Coeur de Pirate", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("","","", R.drawable.album1));
        songs.add(new Song("Adieu","Coeur de Pirate","Coeur de Pirate", R.drawable.album1));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

    }
}
