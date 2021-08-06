package shop.domain.item;

import javax.persistence.Entity;

@Entity
public class Movie extends Item{
    private String director;
    private String title;

    //---

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
