package com.rs.one.to.many;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RightJoin {
	public static void main(String args[])
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Query qry= session.createQuery("select v.vendorName, c.customerName from Vendor v Right Join v.children c");

		List l = qry.list();
		Iterator it=l.iterator();

		while(it.hasNext())
		{
			Object rows[] = (Object[])it.next();
			System.out.println(rows[0]+ " -- " +rows[1]);
		}

	}
}


