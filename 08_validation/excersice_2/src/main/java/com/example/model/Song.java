package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song {

    @Id
    private int id;
    private String singer;
    private String category;
    private String link;
    private String name;

    public Song() {
    }

    public Song(int id, String singer, String category, String link, String name) {
        this.id = id;
        this.singer = singer;
        this.category = category;
        this.link = link;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
