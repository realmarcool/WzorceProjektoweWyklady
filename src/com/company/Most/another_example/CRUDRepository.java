package com.company.Most.another_example;

import java.util.List;

public interface CRUDRepository<T extends BaseModel> {

    void add(T t);

    void delete(T t);

    List<T> getList();
}
