package com.meanwhile.armenSongr.models;

import javax.persistence.*;
import java.util.List;

// TODO: turn into Entity -> DB model
@Entity
public class Album {

    // TODO: setup ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    //IF you need longer than 255 characters, use these 2 annotations
    // @Lob
    // @Type(type = "org.hibernate.type.TextType")
    public String artist;
    public String title;
    public int songCount;
    public double length;
    public String imageUrl;
    @OneToMany(mappedBy = "fromAlbum")
    private List<Song> songsOnAlbum;

    public Album(String artist, String title, int songCount, double length, String imageUrl) {
        this.artist = artist;
        this.title = title;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private Album() {
    }//only for entity?

    public Long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getSongCount() {
        return songCount;
    }

    public double getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public List<Song> getSongsOnAlbum() {
        return songsOnAlbum;
    }
}
