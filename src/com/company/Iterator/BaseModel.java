package com.company.Iterator;

public class BaseModel {
    protected String isbn;

    public BaseModel(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}