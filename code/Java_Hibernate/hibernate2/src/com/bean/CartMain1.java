package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CartMain1 {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        CartBean c1 = new CartBean();

        c1.setDescName("Laptop");
        c1.setPrice(50000);

        session.save(c1);

        tx.commit();

        System.out.println("Data Inserted Successfully");

        session.close();
        factory.close();
    }
}