package com.company.Most;

public class Media {
    private String MovieName;

    public Media(String movieName) {
        MovieName = movieName;
    }

    @Override
    public String toString() {
        return MovieName;
    }
}