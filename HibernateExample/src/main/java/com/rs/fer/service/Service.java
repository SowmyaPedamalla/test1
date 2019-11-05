package com.rs.fer.service;

import java.util.List;

import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;

public interface Service {
	boolean register(User user);
	boolean login(String username,String password);
	boolean addExpense(Expense expense);
	boolean editExpense(Expense expense);
	boolean deleteExpense(int expenseId);
	Expense getExpense(int id);
	List<Expense> getExpenses(int userid);
	List<Expense> expenseReport(int id,String Type,String fromDate,String toDate);
	boolean resetPassword(int userid,String currentPassword,String newPassword);
	User getPersonalInfo(int userid);
	boolean updatePersonalInfo(User user);
	
	
	

}
