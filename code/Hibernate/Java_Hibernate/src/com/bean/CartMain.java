package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CartMain {

    public static void main(String[] args) {

        // Hibernate Configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        // First Product
        CartBean c1 = new CartBean();
        c1.setDescName("Laptop");
        c1.setPrice(50000);

        session.save(c1);

        // Second Product
        CartBean c2 = new CartBean();
        c2.setDescName("Mobile");
        c2.setPrice(20000);

        session.save(c2);

        tx.commit();

        System.out.println("Data Inserted Successfully");

       
        CartBean data1 = session.get(CartBean.class, 1);

        System.out.println("Product Name: " + data1.getDescName());
        System.out.println("Price: " + data1.getPrice());


        CartBean data2 = session.get(CartBean.class, 2);

        System.out.println("Product Name: " + data2.getDescName());
        System.out.println("Price: " + data2.getPrice());

        session.close();
        factory.close();
    }
}