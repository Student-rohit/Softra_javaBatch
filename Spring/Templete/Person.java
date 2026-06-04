package com.core.Templete;

public class Person {

    private int PER_ID;
    private String PER_NAME;

    public Person() {

    }

    public Person(int PER_ID, String PER_NAME) {
        this.PER_ID = PER_ID;
        this.PER_NAME = PER_NAME;
    }

    public int getPER_ID() {
        return PER_ID;
    }

    public void setPER_ID(int PER_ID) {
        this.PER_ID = PER_ID;
    }

    public String getPER_NAME() {
        return PER_NAME;
    }

    public void setPER_NAME(String PER_NAME) {
        this.PER_NAME = PER_NAME;
    }
}