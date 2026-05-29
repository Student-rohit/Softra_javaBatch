package com.core.annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;
    private String state;

    // Default Constructor
    public Address() {
        this.city = "Pune";
        this.state = "Maharashtra";
    }

    // Getters and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // toString Method
    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + "]";
    }
}