package com.mkyong.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rs.bean.wrapper.Product;



public class Transient {
	 public static void main(String[] args)
	    {

	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml"); 

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        Product p=new Product(); 

	       // p.setProductId(106);
	       // p.setProName("AC");
	       // p.setPrice(14000);

	        Transaction tx = session.beginTransaction();
	        session.save(p);
	        System.out.println("Object saved successfully.....!!");
	        tx.commit();
	        
	        Stock stockObj=(Stock)session.get(Stock.class,1);
	        if(stockObj!=null) {
	        System.out.println("Get1:"+stockObj.getStockCode()+" and "+stockObj.getStockName());
	        }
	        
	         stockObj=(Stock)session.get(Stock.class,1);
	        if(stockObj!=null) {
	        System.out.println("Get2:"+stockObj.getStockCode()+" and "+stockObj.getStockName());
	        }
	        
	        stockObj=(Stock)session.load(Stock.class,2);
	        if(stockObj!=null) {
	        System.out.println("Load1:"+stockObj.getStockCode()+" and "+stockObj.getStockName());
	        }
	        
	        stockObj=(Stock)session.load(Stock.class,2);
	        if(stockObj!=null) {
	        System.out.println("Load2:"+stockObj.getStockCode()+" and "+stockObj.getStockName());
	        }
	        session.close();
	        factory.close();
	    }

	}


