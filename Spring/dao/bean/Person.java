package com.dao.bean;

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

    public void display() {
        System.out.println("Person ID : " + PER_ID);
        System.out.println("Person Name : " + PER_NAME);
    }

    public static void main(String[] args) { 
    	Person p1 = new Person();
    	p1.setPER_ID(101); 
    	p1.setPER_NAME("Rohit"); 
    	p1.display(); 
    	System.out.println("----------------"); 
    	Person p2 = new Person(102, "Amit");
    	System.out.println("ID : " + p2.getPER_ID());
    	System.out.println("Name : " + p2.getPER_NAME());
    	
    }
    
}