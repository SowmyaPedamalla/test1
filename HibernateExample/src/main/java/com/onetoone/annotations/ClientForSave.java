package com.onetoone.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForSave {
	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student s = new Student();
		s.setStudentId(102);
		s.setStudentName("James");
		s.setGrp("CECs");

		Address ad = new Address();
		ad.setAddressId(2);
		ad.setPlace("TELANGANA");

		ad.setParent(s);
		Transaction tx = session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("One to One with annotations is done..!!!!");
		factory.close();
	}

}
