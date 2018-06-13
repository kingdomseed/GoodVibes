package com.holtnet.goodvibes;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    private ArrayList<Song> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        songs.add(new Song("Comme des Enfants", "Coeur de Pirate", "Coeur de Pirate", R.drawable.album1));
        songs.add(new Song("Pour un infidèle", "Coeur de Pirate", "Coeur de Pirate", R.drawable.album1));
        songs.add(new Song("Ensemble", "Coeur de Pirate", "Coeur de Pirate", R.drawable.album1));
        songs.add(new Song("Francis", "Coeur de Pirate", "Coeur de Pirate", R.drawable.album1));
        songs.add(new Song("Adieu", "Blonde", "Coeur de Pirate", R.drawable.album2));
        songs.add(new Song("Golden Baby", "Blonde", "Coeur de Pirate", R.drawable.album2));
        songs.add(new Song("Place de la République", "Blonde", "Coeur de Pirate", R.drawable.album2));
        songs.add(new Song("Crier tout bas", "Roses", "Coeur de Pirate", R.drawable.album3));
        songs.add(new Song("Drapeau Blanc", "Roses", "Coeur de Pirate", R.drawable.album3));
        songs.add(new Song("Oublie-moi", "Roses", "Coeur de Pirate", R.drawable.album3));
        songs.add(new Song("Prémonition", "En cas de tempête, ce jardin sera fermé", "Coeur de Pirate", R.drawable.album4));
        songs.add(new Song("Somnambule", "En cas de tempête, ce jardin sera fermé", "Coeur de Pirate", R.drawable.album4));
        songs.add(new Song("Dans la nuit", "En cas de tempête, ce jardin sera fermé", "Coeur de Pirate", R.drawable.album4));

        SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song songToPass = songs.get(position);
                Intent playIntent = new Intent(view.getContext(), PlayActivity.class);
                playIntent.putExtra("songDataToPass", songToPass);
                setResult(RESULT_OK, playIntent);
                finish();
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return false;
    }
}
