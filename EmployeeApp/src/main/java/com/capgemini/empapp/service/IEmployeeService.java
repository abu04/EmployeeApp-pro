package com.capgemini.empapp.service;
import com.capgemini.empapp.exception.InvalidEmployeeIdExcption;
import java.util.*;
import com.capgemini.empapp.exception.WrongSalaryException;
import com.capgemini.empapp.dto.Employee;
public interface IEmployeeService {
	
	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public boolean editExpByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public List<Employee> getAllEmployees();
	 
	 public List<Employee> getEmployeeBySalary(int salary);
	 
	 public List<Employee> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

}
