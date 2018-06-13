package com.holtnet.goodvibes;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends ArrayAdapter {

    public SongAdapter(Context context, List<Song> songs) {
        super(context, R.layout.library_layout, songs);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.library_layout, parent, false);
        }

        Song currentSong = (Song) getItem(position);

        TextView songNameTextView = convertView.findViewById(R.id.SongName);
        songNameTextView.setText(currentSong.getmSongName());

        TextView albumNameTextView = convertView.findViewById(R.id.AlbumName);
        albumNameTextView.setText(currentSong.getmAlbumName());

        TextView artistNameTextView = convertView.findViewById(R.id.ArtistName);
        artistNameTextView.setText(currentSong.getmArtistName());

        ImageView albumArtImageView = convertView.findViewById(R.id.AlbumArt);
        albumArtImageView.setImageResource(currentSong.getmAlbumArt());

        return convertView;
    }
}
