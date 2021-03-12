package com.capgemini.empapp.dao;
import com.capgemini.empapp.exception.InvalidEmployeeIdExcption;
import com.capgemini.empapp.exception.WrongSalaryException;
import com.capgemini.empapp.dto.Employee;
import java.util.*;
public interface IEmployeeDAO {

	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public boolean editExpByEmployeeId(int id)throws InvalidEmployeeIdExcption;
	 
	 public List<Employee> getAllEmployees();
	 
	 public List<Employee> getEmployeeBySalary(int salary);
	 
	 public List<Employee> getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);
}
