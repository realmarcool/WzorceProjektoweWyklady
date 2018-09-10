package com.company.Obserwator;

public class NewsLetter {
    private String title;
    private String description;

    public NewsLetter(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return " o tytule: " + title + " - " + description ;
    }
}
