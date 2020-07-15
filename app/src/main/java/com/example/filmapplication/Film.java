package com.example.filmapplication;

public class Film {
    private int img;
    private String description;

    public Film (int img, String description) {
        this.img = img;
        this.description = description;

    }

    public  int getImg() {
        return this.img;
    }
    public String getDesc() {
        return this.description;
    }
}

