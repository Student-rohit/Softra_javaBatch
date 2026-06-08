package com.dao.bean;

import java.util.List;

// Interface
public interface Dao {

    boolean create(Person p);

    Person retrive(int id);
}