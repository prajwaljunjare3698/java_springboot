package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.HomeDao;
import com.app.iservice.ServiceInterface;
import com.app.model.Employee;

@Service
public class HomeService implements ServiceInterface{

	@Autowired
	private HomeDao homeDao;

	@Override
	public int saveEmployee(Employee emp) {
			int id =	homeDao.saveEmployee(emp);
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList =	homeDao.getAllEmployee();
		return empList;
	}

	@Override
	public List<Employee> deleteEmployee(int empId) {
		List<Employee> empList = homeDao.deleteEmployee(empId);
		return empList;
	}

	@Override
	public Employee editEmployee(int empId) {
		Employee emp = homeDao.editEmployee(empId);
		return emp;
	}

	@Override
	public List<Employee> updateEmployee(Employee emp) {
		List<Employee> empList = homeDao.updateEmployee(emp);
		return empList;
	}
	
	
	
	
	
	
}
