package com.capg.empapp.service;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdExcption;
import com.capg.empapp.exception.WrongSalaryException;

public interface IEmployeeService {
	
	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public boolean editExpByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public Employee[] getAllEmployees();
	 
	 public Employee[] getEmployeeBySalary(int salary);
	 
	 public Employee[] getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

}
