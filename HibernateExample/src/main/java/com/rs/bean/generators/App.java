package com.rs.bean.generators;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	 public static void main( String[] args )
	    {
	        System.out.println("Maven + Hibernate + MySQL");
	        
	        Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml"); 

			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
	        
	        Transaction transaction=session.beginTransaction();
	        Stock stock = new Stock();
	        
	       // stock.setStockId(100);
	        stock.setStockCode("123");
	        stock.setStockName("rinku");
	        
	        session.save(stock);
	        transaction.commit();
	        factory.close();
	       
	    }
	}





