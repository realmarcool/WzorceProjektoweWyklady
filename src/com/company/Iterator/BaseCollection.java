package com.company.Iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCollection<T extends BaseModel> {

    protected List<T> collection = new ArrayList<>();

    public void addItem(T item) {
        this.collection.add(item);
    }

    public abstract Iterator<T> getIterator();
}