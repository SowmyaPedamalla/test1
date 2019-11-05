package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class DeleteExpense {

	public static void main(String[] args) {
		
		
		Service service=new ServiceImpl();
		Expense expense=new Expense();
		expense.setId(1);
		boolean isRecordEdited=service.deleteExpense(expense.getId());
		if(isRecordEdited){
		
			 
				System.out.println("record deleted sucessfully.....");
			}else {
				System.out.println("no matched records found.........");
				}
		
				}
			}

		



