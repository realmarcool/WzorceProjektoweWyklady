package com.company.Iterator;

public class Book extends BaseModel {
    private String title;
    private int yearOfRelease;

    public Book(String isbn, String title, int yearOfRelease) {
        super(isbn);
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}