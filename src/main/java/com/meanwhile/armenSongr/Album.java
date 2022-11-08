package com.meanwhile.armenSongr;

public class Album {
    public String artist;
    public String title;
    public int songCount;
    public double length;
    public String imageUrl;

    public Album(String artist, String title, int songCount, double length, String imageUrl) {
        this.artist = artist;
        this.title = title;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

}
