package com.holtnet.goodvibes;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Song {

    private String mSongName;
    private String mAlbumName;
    private String mArtistName;
    private int mAlbumArt;

    public Song(String songName, String albumName, String artistName, int albumArt)
    {
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmAlbumName() {
        return mAlbumName;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getmAlbumArt() {
        return mAlbumArt;
    }
}
