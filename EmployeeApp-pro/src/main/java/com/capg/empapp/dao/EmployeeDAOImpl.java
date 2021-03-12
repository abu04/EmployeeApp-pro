package com.capg.empapp.dao;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exception.InvalidEmployeeIdExcption;
import com.capg.empapp.exception.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

	public boolean addEmployee(Employee e) throws WrongSalaryException{
         // SQL  insert into employee ...... 
		
		//System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public Employee[] getAllEmployees() {

		return EmployeeDB.employees;
	}
	
	//============================================================
	
	
	public boolean editSalaryByEmployeeId(int id) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		return EmployeeDB.editSalary(id);
	}

	public boolean editExpByEmployeeId(int id) throws InvalidEmployeeIdExcption {
		// TODO Auto-generated method stub
		return  EmployeeDB.editExp(id);
	}

	

	public Employee[] getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		
		return EmployeeDB.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return EmployeeDB.getEmployeeBySalaryRange(salaryRangeMin,salaryRangeMax);
	}

}
