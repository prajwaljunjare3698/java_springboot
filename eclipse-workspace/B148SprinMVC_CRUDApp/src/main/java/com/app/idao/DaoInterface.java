package com.app.idao;

import java.util.List;

import com.app.model.Employee;

public interface DaoInterface {

	public int saveEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public List<Employee> deleteEmployee(int empId);
	public Employee editEmployee(int empId);
	public List<Employee> updateEmployee(Employee emp);
}
