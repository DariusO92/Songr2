package com.DariusO.Songr2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Album {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;
    private String title;
    private String artist;
    private   int songCount;
    private  double albumLengthSeconds;

    private String imgUrl;

    public Album(String title, String artist, int songCount, double albumLengthSeconds, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.albumLengthSeconds = albumLengthSeconds;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public double getAlbumLengthSeconds() {
        return albumLengthSeconds;
    }

    public void setAlbumLengthSeconds(double albumLengthSeconds) {
        this.albumLengthSeconds = albumLengthSeconds;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
