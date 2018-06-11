package com.holtnet.goodvibes;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

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

    private Song(Parcel in)
    {
        mSongName = in.readString();
        mAlbumName = in.readString();
        mArtistName = in.readString();
        mAlbumArt = in.readInt();
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(mSongName);
        dest.writeString(mAlbumName);
        dest.writeString(mArtistName);
        dest.writeInt(mAlbumArt);
    }

    public static final Parcelable.Creator<Song> CREATOR
            = new Parcelable.Creator<Song>() {

        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

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
