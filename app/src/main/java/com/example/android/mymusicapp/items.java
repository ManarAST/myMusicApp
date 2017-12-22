package com.example.android.mymusicapp;



public class items {
    private String mSongName;
    private String mArtistName;

    private String mPlaylistName;
    private int mNumberOfTracks;

    public items(String songName, String artistName){
        mSongName = songName;
        mArtistName = artistName;
    }
    public items(String playlistName, int numberOfTracks){
        mPlaylistName = playlistName;
        mNumberOfTracks = numberOfTracks;
    }


    public String getmSongName (){
        return mSongName;
    }

    public String getmArtistName(){
        return mArtistName;
    }

    public String getmPlaylistName(){
        return mPlaylistName;
    }

    public int getmNumberOfTracks(){
        return mNumberOfTracks;
    }


}
