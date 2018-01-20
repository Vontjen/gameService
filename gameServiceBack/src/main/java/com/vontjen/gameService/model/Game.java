package com.vontjen.gameService.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Game {


    @Id @GeneratedValue
    private String id;
    @Column(length = 200)
    private String title;
    @Column(length = 1000)
    private String description;
    @ElementCollection
    private List<Genre> categories;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Genre> getCategories() {
        return categories;
    }

    public void setCategories(List<Genre> categories) {
        this.categories = categories;
    }
}
