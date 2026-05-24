package com.HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DiskMain {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(DiskBean.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
        

        // HQL Query to retrieve all Disk objects
        Query q1 = session.createQuery("from DiskBean");
        
        // avg value from disk 
        Query q2 = session.createQuery(
        	    "select avg(price) from DiskBean");
        
        System.out.println(q1.list());
        System.out.println(q2.list());

        tx.commit();

        session.close();
        factory.close();
    }
}