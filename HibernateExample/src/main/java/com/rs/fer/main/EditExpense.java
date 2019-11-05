package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class EditExpense {

	public static void main(String[] args) {
		Service service=new ServiceImpl();
		Expense expense=new Expense();
			expense.setType( "shopping");
			expense.setDate("27-8-19");
			expense.setPrice( "3000");
			expense.setNumberofitems( "6");
			expense.setTotal("5000");
			expense.setBywhom( "sweety");
			expense.setUserid( 3);
			expense.setId(1 );
			boolean isRecordEdited=service.editExpense(expense);
			if(isRecordEdited)
		
		{
				System.out.println("records edited sucessfully.....");
			}else {
				System.out.println("no matched records found");
				}
			}

		}



