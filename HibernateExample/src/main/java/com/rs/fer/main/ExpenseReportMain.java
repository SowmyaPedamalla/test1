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

public class ExpenseReportMain {

	public static void main(String[] args) {
		Service service =new ServiceImpl();
		List<Expense> List=service.expenseReport(2,"shopping","2019-08-01","2019-08-30");
		if(List!=null) {
			System.out.println("records fetched successfully");
			
		}else {
			System.out.println("no records found");
	
	
		}

	}
}
