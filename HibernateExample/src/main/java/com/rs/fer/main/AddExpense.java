package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class AddExpense {

	public static void main(String[] args) {
		Service service=new ServiceImpl();
				Expense expense=new Expense();
			expense.setType( "shopping");
	expense.setDate("2019-08-27 ");
			expense.setTotal( "3000 ");
			expense.setNumberofitems( "10 ");
			expense.setPrice( "10000 ");
			expense.setBywhom( "Sowmya ");
			expense.setUserid( 1);
			boolean isRecordInserted=service.addExpense(expense);
			if(isRecordInserted)
		
			 {
				System.out.println("Data inserted Sucessfully");
			}else {
				System.out.println("please try again.........");
				
				}
			}

		}



