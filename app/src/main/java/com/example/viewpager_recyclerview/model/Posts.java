package com.example.viewpager_recyclerview.model;

public class Posts {
    String pstName;
    Double rating;

    public Posts(String pstName, Double rating) {
        this.pstName = pstName;
        this.rating = rating;
    }

    public String getPstName() {
        return pstName;
    }

    public void setPstName(String pstName) {
        this.pstName = pstName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
