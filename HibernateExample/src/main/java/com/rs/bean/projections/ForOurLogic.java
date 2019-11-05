package com.rs.bean.projections;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class ForOurLogic {
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Criteria crit = session.createCriteria(Product.class);


		crit.setProjection(Projections.property("proName"));
		List l=crit.list();
		Iterator it=l.iterator();

		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}

		System.out.println("................");

		crit.setProjection(Projections.property("price"));
		List list=crit.list();
		Iterator iterator=list.iterator();

		while(iterator.hasNext())
		{
			Double s=(Double)iterator.next();
			System.out.println(s);
		}

		session.close();
		factory.close();
	}

}


