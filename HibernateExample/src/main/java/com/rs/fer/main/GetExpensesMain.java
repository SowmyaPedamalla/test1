package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class GetExpensesMain {

	public static void main(String[] args) {
		Service service =new ServiceImpl();
		//Expense expense=new Expense();
		List<Expense>list=service.getExpenses(2);
		if(list!=null) {
			System.out.println(list);
		}else {
			System.out.println("no records found");
			
		
		}

	}
}
