package com.rs.bean.versioning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForUpdate {
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Product.class,new Integer(106));
		Product s=(Product)o;

		Transaction tx = session.beginTransaction();	

		 s.setPrice(4000); // implicitly update method will be call

		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}

}


