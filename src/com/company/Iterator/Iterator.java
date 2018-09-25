package com.company.Iterator;

public interface Iterator<T extends BaseModel> {
    boolean hasNext();
    T next();
}