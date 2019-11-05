package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class GetExpense {

	public static void main(String[] args) {
		Service service=new ServiceImpl();
		Expense expense =service.getExpense(2);
		
		String Type=expense.getType();
		String Date=expense.getDate();
		String Price=expense.getPrice();
		String numberofitems=expense.getNumberofitems();
		String total=expense.getTotal();
		String bywhom=expense.getBywhom();
		System.out.println("type: "+ Type +" "+ "date:"+ Date +" "+ "price:"+" "+ Price +" "+ "numberofitems:"+ numberofitems+" " +"total:"+ total +" "+"bywhom:"+bywhom);
				
		}

	}

