package com.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private int id;
    private String name;

    @Autowired
    private Address addr1;

    // Default Constructor
    public Person() {
        super();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr1() {
        return addr1;
    }

    public void setAddr1(Address addr1) {
        this.addr1 = addr1;
    }

    // toString Method
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", addr1=" + addr1 + "]";
    }
}