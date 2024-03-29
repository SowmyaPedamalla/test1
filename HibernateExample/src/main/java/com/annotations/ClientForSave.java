package com.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClientForSave { 

    public static void main(String[] args)
    {

        AnnotationConfiguration cfg=new AnnotationConfiguration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Product p=new Product(); 

        p.setProductId(1066);
        p.setProName("jsp");
        p.setPrice(15000);

        Transaction tx = session.beginTransaction();
        session.save(p);
        System.out.println("Object saved successfully using annotations.....!!");
        tx.commit();
        session.close();
        factory.close();
    }

}