package com.rs.bean.versioning;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLExamples {
	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Query query=session.createQuery("select p from Product p");
		List<Product>products=query.list();
		Iterator<Product>iterator=products.iterator();
		
		Product product=null;
		while(iterator.hasNext()) {
			product=iterator.next();
			System.out.println(product.getProductId()+" ,"+product.getProName());
		}
		System.out.println("................");
		
		query=session.createQuery("select p.productId from Product p");
		List<Integer>productIds=query.list();
		Iterator<Integer>iditerator=productIds.iterator();
		
		Integer productId=null;
		while(iditerator.hasNext()) {
			productId=iditerator.next();
			System.out.println(productId);
		}
		System.out.println("................");
		
		query=session.createQuery("select p.productId,p.proName from Product p");
		List<Object[]>productArr=query.list();
		Iterator<Object[]>productArrIterator=productArr.iterator();
		
		Object[] objectArr=null;
		while(productArrIterator.hasNext()) {
			objectArr=productArrIterator.next();
			System.out.println(objectArr[0]+","+objectArr[1]);
		}


		//Transaction tx = session.beginTransaction();	


		//tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
		factory.close();
	}

}



