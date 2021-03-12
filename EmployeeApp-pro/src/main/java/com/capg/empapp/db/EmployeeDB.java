package com.capg.empapp.db;

import com.capg.empapp.dto.Employee;
import java.util.*;
public class EmployeeDB {
	// Employee cannot be resolved to a type
	public static Employee employees[]  = new Employee[100];
	public static int count = 0,c=0;
	
	
	static {
		
		employees[count++] = 	new Employee(101, "ramesh", 8, 7000);
		employees[count++] = 	new Employee(102, "suresh", 2, 15000);
		employees[count++] = 	new Employee(103, "rakesh", 1, 10000);
		employees[count++] = 	new Employee(104, "lokesh", 5, 5000);
		
		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		employees[count++] = e;
	
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}

	public static Employee[] getEmployeeBySalary(int salary) {
		Employee sal[]= new Employee[count];
		for (int i =0;i<count;i++) {
			if(employees[i].getSalary()==salary) 
				sal[c++]=employees[i];
				System.out.println(c);
			}
		
		return sal;
	}
	
	public static Employee[] getEmployeeBySalaryRange(int smin,int smax) {
		Employee sal[]= new Employee[count];
		for (int i =0;i<count;i++) {
			if(employees[i].getSalary()>=smin && employees[i].getSalary()<smax) 
				sal[c]=employees[i];
				c++;
				//System.out.println(c);
			}
		return sal;
	}
	
	public static boolean editSalary(int id) {
		Scanner sc= new Scanner(System.in);
        for(Employee i:employees) {
        	System.out.println("i value"+i.getEmployeeId());
        	if(i.getEmployeeId()==id) {
        		System.out.println("Enter new salary");
        		int ns= sc.nextInt();
        		i.setSalary(ns);
        		break;
        	}
        	
        }
        return true;
		
		
		
	}
	public static boolean editExp(int id) {
		Scanner sc= new Scanner(System.in);
        for(Employee i:employees) {
        	if(i.getEmployeeId()==id) {
        		System.out.println("Enter new salary");
        		int ns= sc.nextInt();
        		i.setExp(ns);
        		break;
        	}
        	
        }
        return true;
		
		
		
	}
	
}
