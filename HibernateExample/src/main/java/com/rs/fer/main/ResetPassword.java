package com.rs.fer.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rs.fer.bean.User;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class ResetPassword {

	public static void main(String[] args) {
		Service service=new ServiceImpl();
		User user =new User();
		user.setId(1);
		user.setPassword("welcome");
		boolean isRecordEdited=service.resetPassword(user.getId() ,"1234", user.getPassword());
		if(isRecordEdited) {

			System.out.println("password updated sucessfully...");
		
			}else {
				System.out.println("no mathed records found....");
				
			}

		}
}


