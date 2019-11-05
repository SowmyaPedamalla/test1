package com.mkyong.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        
        Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
        
        Transaction transaction=session.beginTransaction();
        Stock stock = new Stock();
        
       // stock.setStockId(1);
       // stock.setStockCode("123");
       // stock.setStockName("rinku");
        
        session.save(stock);
        transaction.commit();
        
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
        factory.close();
       
    }
}
