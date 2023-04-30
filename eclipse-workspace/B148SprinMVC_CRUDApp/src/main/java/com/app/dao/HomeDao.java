package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.idao.DaoInterface;
import com.app.model.Employee;

@Repository
public class HomeDao implements DaoInterface {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public int saveEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		int id = (int) session.save(emp);

		tx.commit();
		session.close();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("From Employee");
		List<Employee> empList = query.list();
		tx.commit();
		session.close();
		return empList;
	}

	@Override
	public List<Employee> deleteEmployee(int empId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("DELETE from Employee where empId ='" + empId + "'");
		int id = query.executeUpdate();
		List<Employee> empList = new ArrayList<Employee>();
		if (id > 0) {
			Query query1 = session.createQuery("From Employee");
			empList = query1.list();
		}
		tx.commit();
		session.close();
		return empList;
	}

	@Override
	public Employee editEmployee(int empId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Employee where empId ='" + empId + "'");
		Employee emp = (Employee) query.getSingleResult();
		return emp;
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("UPDATE Employee SET empName = '" + emp.getEmpName() + "', cityName = '"
				+ emp.getCityName() + "', userName = '" + emp.getUserName() + "', password = '" + emp.getPassword()
				+ "' where empId ='" + emp.getEmpId() + "'");
		int id = query.executeUpdate();
		List<Employee> empList = new ArrayList<Employee>();
		Query query1 = session.createQuery("From Employee");
		empList = query1.list();

		tx.commit();
		session.close();
		return empList;
	}

}
