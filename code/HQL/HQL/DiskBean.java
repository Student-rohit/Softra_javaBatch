
package com.HQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
//@Table(name = "disk")
public class DiskBean {

    @Id
    private int id;
    
    private String name;
    
   
    private int storage;
    
    private double price;

    public DiskBean() {
    }

    public DiskBean(int id, String name, int storage, double price) {
        this.id = id;
        this.name = name;
        this.storage = storage;
        this.price = price;
    }

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

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DiskBean [id=" + id + 
               ", name=" + name + 
               ", storage=" + storage + 
               ", price=" + price + "]";
    }
}