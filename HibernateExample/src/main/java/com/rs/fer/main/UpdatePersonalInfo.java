package com.rs.fer.main;

import com.rs.fer.bean.Address;
import com.rs.fer.bean.User;
import com.rs.fer.service.Service;
import com.rs.fer.service.ServiceImpl;

public class UpdatePersonalInfo {

	public static void main(String[] args) {
		Service Service=new ServiceImpl();
		User user=new User();
		user.setFirstname("pedamalla");
		user.setMiddlename("pedamalla");

		user.setLastname("pedamalla");
		user.setEmail("pedamalla");
		user.setUsername("pedamalla");
		user.setPassword("pedamalla");
		user.setMobilenumber("pedamalla");
		user.setId(3);
		Address address=new Address();
		address.setId(2);
		address.setLine1("kanchikacherla");
		address.setLine2("nehrucenter");
		address.setCity("vijayawada");
		address.setStreet("abc");
		address.setZip("521180");
		address.setCountry("india"); 
		address.setUserid(2);
		
		user.setAddress(address);
		
		boolean updatePersonal=Service.updatePersonalInfo(user);
		if(updatePersonal) {
			System.out.println("successfully....");
		}else
		 {
			System.out.println("failed.....");
		}






	}

}
