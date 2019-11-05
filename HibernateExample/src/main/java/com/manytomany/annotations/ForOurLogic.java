package com.manytomany.annotations;

	import java.util.HashSet;
	import java.util.Set;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class ForOurLogic { 

		public static void main(String args[])
		{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 

			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session ses = factory.openSession();	

			Catagories c1 = new Catagories();
			c1.setCategoryId(34);
			c1.setCategoryName("cat 1");

			Catagories c2=new Catagories();
			c2.setCategoryId(35);
			c2.setCategoryName("cat 2");

			Item i1=new Item();
			Item i2 = new Item();

			i1.setItemId(107);
			i1.setItemName("item1");

			i2.setItemId(108);
			i2.setItemName("item2");

			Set  s =new HashSet();
			s.add(i1);
			s.add(i2);

			c1.setItems(s);
			c2.setItems(s);

			Transaction tx = ses.beginTransaction();
			ses.save(c1);
			ses.save(c2);
			tx.commit();
			System.out.println("Many to Many using annotations been done...!!!!!");
			ses.close();
		}

	

}
