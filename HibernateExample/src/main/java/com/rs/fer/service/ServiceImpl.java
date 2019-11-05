package com.rs.fer.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;
import com.rs.fer.util.HibernateUtil;

public class ServiceImpl implements Service {
	Connection connection = null;
	PreparedStatement statement = null;
	public boolean register(User user) {
		int insertedRecords = 0;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			insertedRecords = (Integer) session.save(user);
			transaction.commit();
			System.out.println(insertedRecords + " Record is Inserted");
			System.out.println(user.getFirstname() + ", " + user.getMiddlename() + ", " + user.getLastname() + ", "
					+ user.getUsername() + ", " + user.getPassword() + ", " + user.getEmail() + ", "
					+ user.getMobilenumber());

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return insertedRecords > 0;
	
		
	}
	public boolean login(String username, String password) {
		boolean isValidUser = true;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			Query query = session.createQuery("from User u where u.username=? and u.password=?");
			query.setParameter(0, username);
			query.setParameter(1, password);

			List list = query.list();
			Iterator iterator = list.iterator();

			System.out.println(username + ", " + password);
			while (iterator.hasNext()) {

				User user = (User) iterator.next();

				return isValidUser;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
	public boolean addExpense(Expense expense) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean editExpense(Expense expense) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean deleteExpense(int expenseId) {
		// TODO Auto-generated method stub
		return false;
	}
	public Expense getExpense(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Expense> getExpenses(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Expense> expenseReport(int id, String Type, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean resetPassword(int userid, String currentPassword, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	public User getPersonalInfo(int userid) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean updatePersonalInfo(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	
	}

