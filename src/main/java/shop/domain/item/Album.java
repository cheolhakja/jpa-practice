package shop.domain.item;

import javax.persistence.Entity;

@Entity
public class Album extends Item{
    private String artist;
    private String albumName;

    //---
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
}
