package com.holtnet.goodvibes;

public class Song {

    private String mSongName;
    private String mAlbumName;
    private String mArtistName;
    private int mTrackNumber;

    public Song(String songName, String albumName, String artistName, int trackNumber)
    {
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
        mTrackNumber = trackNumber;
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

    public int getmTrackNumber() {
        return mTrackNumber;
    }
}
