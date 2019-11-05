package com.rs.manyone.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {
	public static void main(String args[])
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Vendor v =new Vendor();

		            v.setVendorId(102);
		            v.setVendorName("java4s");

		 Customer c1=new Customer();

		             c1.setCustomerId(507);
		             c1.setCustomerName("customer7");
		             c1.setParentObjects(v);

		 Customer c2=new Customer();

		             c2.setCustomerId(508);
		             c2.setCustomerName("customer8");
		             c2.setParentObjects(v);

         Customer c3=new Customer();

		             c3.setCustomerId(509);
		             c3.setCustomerName("customer9");
		             c3.setParentObjects(v);           		             

		    Transaction tx = session.beginTransaction();

		                      session.save(c1);
		                      session.save(c2);
		                      session.save(c3);

		    tx.commit();
		    session.close();
		    System.out.println("many to one is Done..!!");
		    factory.close();

	}


}