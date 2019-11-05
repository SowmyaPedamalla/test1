package com.rs.fer.main;

import com.rs.fer.bean.User;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class Registration {

	public static void main(String[] args) {
		Service service = new ServiceImpl();

		User user = new User();

		user.setFirstname("pedamalla");
		user.setMiddlename("Sree ");
		user.setLastname("Sowmya ");
		user.setUsername("sowmya@123 ");
		user.setPassword("hello ");
		user.setEmail("sowmyapedamalla@gmail.com ");
		user.setMobilenumber("9876543210");

		boolean isRegister = service.register(user);
		if (isRegister) {
			System.out.println("Data inserted Sucessfully");
		} else {
			System.out.println("please try again.........");

		}
	}

}
