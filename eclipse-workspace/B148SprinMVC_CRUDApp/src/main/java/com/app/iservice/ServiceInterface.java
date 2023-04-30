package com.app.iservice;

import java.util.List;

import com.app.model.Employee;

public interface ServiceInterface {

	public int saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	
	public List<Employee> deleteEmployee(int empId);
	
	public Employee editEmployee(int empId);
	
	public List<Employee> updateEmployee(Employee emp);
}
