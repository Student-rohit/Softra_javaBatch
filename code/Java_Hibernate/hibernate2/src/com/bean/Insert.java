package com.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

    public static void main(String[] args) {

        Session session = new Configuration()
                .configure()
                .buildSessionFactory()
                .openSession();

        Transaction tx = session.beginTransaction();

        CartBean c = new CartBean();

        
        c.setDescName("keyboard");
        c.setPrice(1500);

        session.save(c);

        tx.commit();
        
        System.out.println("Generated ID = " + c.getId());

        session.close();

        System.out.println("Inserted");
    }
}