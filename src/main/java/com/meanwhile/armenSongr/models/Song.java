package com.meanwhile.armenSongr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String title;
    private int length;
    private int trackNumber;
    @ManyToOne
    Album fromAlbum;

    public Song(String title, int length, int trackNumber, Album fromAlbum) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.fromAlbum = fromAlbum;
    }

    private Song() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
