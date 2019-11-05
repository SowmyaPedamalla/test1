package com.rs.bean.trans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForPersist {
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		//Object o=session.load(Product.class,new Integer(106));
		Product s= new Product();
		 s.setProductId(106); 
		 s.setProName("AC"); 

		 s.setPrice(14000); 


		Transaction tx = session.beginTransaction();	
		session.persist(s);



		System.out.println("Object Updated successfully.....!!");
		tx.commit();

		session.close();
		factory.close();
	}

}


