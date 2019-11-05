package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class LoginMain {

	public static void main(String[] args) {
		Service service =new ServiceImpl();
		
					
			String username="sowmya@123";
			String password="hello";
			boolean isValidUser=service.login(username,password);
			if(isValidUser) {
				System.out.println("fetched records sucessfully...");
			}else {
				System.out.println("no matched records found...");
				
				
		
			
				
		
			
			
				}
			}

		}



