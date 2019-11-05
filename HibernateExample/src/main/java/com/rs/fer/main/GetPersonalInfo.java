package com.rs.fer.main;

import com.rs.fer.bean.User;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class GetPersonalInfo {

	public static void main(String[] args) {
		Service Service=new ServiceImpl();
		int userId=2;
		User getPersonalInfo=Service.getPersonalInfo(userId);
		if(getPersonalInfo!=null) {
			System.out.println("sucessfully....");
			
		}else {
			 System.out.println("failed");
			 
		}

	}

}
