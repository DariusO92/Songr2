package com.DariusO.Songr2;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    private String sTitle;
    private int length;
    private int trackNumber;

    @ManyToOne
    Album album;

    public Song(){

    }

    public Song(String sTitle, int length, int trackNumber, Album onAlbum) {
        this.sTitle = sTitle;
        this.length = length;
        this.trackNumber = trackNumber;
        album = onAlbum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
