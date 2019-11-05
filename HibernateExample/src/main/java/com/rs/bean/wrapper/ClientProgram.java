package com.rs.bean.wrapper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientProgram {
	 public static void main(String[] args)
	    {

	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        Product p=new Product(); 

	        p.setProductId(105);
	        p.setProName("watch");
	        p.setPrice(35000);       

	        Transaction tx = session.beginTransaction();
	        session.save(p);
	        System.out.println("Object saved successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
	    }

	}


