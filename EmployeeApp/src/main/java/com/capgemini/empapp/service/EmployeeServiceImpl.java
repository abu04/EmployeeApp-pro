package com.capgemini.empapp.service;
import java.util.*;
import com.capgemini.empapp.dao.EmployeeDAOImpl;
import com.capgemini.empapp.dao.IEmployeeDAO;
import com.capgemini.empapp.db.EmployeeDB;
import com.capgemini.empapp.dto.Employee;
import com.capgemini.empapp.exception.InvalidEmployeeIdExcption;
import com.capgemini.empapp.exception.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
   // Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
			//System.out.println(" ------------>> inside service "+e);
		
			if(e.getSalary()> 50000)
			{
				throw new WrongSalaryException();
			}
			else return dao.addEmployee(e);		
		
	}

	public List<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}
	
	
	// ================================================================================

	public boolean editSalaryByEmployeeId(int id) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		 return dao.editSalaryByEmployeeId(id)	;
		
	}

	public boolean editExpByEmployeeId(int id) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		return dao.editExpByEmployeeId(id);
	}

	public List<Employee> getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return dao.getEmployeeBySalary(salary);
	}

	public List<Employee> getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}
