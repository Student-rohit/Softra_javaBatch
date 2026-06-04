package com.core.Templete;

import java.util.List;

public interface Dao {

    int insert(Person p);

    List<Person> getAll();
}