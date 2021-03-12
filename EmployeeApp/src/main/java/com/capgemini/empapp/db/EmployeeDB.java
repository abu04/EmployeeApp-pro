package com.capgemini.empapp.db;
import java.util.*;

import com.capgemini.empapp.dto.Employee;
public class EmployeeDB {
	public static List<Employee> list = new ArrayList<Employee>();
	static Iterator<Employee> iter = list.iterator();
	
	public static int count = 0,c=0;
	
	
	static {

		list.add(new Employee(101, "ramesh", 8, 7000));
		list.add(new Employee(102, "suresh", 2, 15000));
		list.add(new Employee(103, "rakesh", 1, 10000));
		list.add(new Employee(104, "lokesh", 5, 5000));

		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		
		list.add(e);
	
		return true;
	}

	public static List<Employee> getEmployeeBySalary(int salary) {
		
		List<Employee> sal=new ArrayList<Employee>();
		Iterator i1 = list.iterator();
		while(i1.hasNext()) {
			Employee emp = (Employee) i1.next();
			if(emp.getSalary()==salary) {
				sal.add(emp);
				
			}
			
		}		
		return sal;
	}
	
	public static List<Employee> getEmployeeBySalaryRange(int smin,int smax) {
		List<Employee> li = new ArrayList<Employee>();
		Iterator i2 = list.iterator();

		while(i2.hasNext()){
			Employee emp1= (Employee) i2.next();
			if(emp1.getSalary()>=smin && emp1.getSalary()<smax) 
				li.add(emp1);
				//System.out.println(c);
			}
		
		return li;
	}
	
	public static boolean editSalary(int id) {
		Scanner sc= new Scanner(System.in);
		Iterator i3 = list.iterator();

		while(i3.hasNext()) {
        	//System.out.println("i value"+i.getEmployeeId());
			Employee emp2=(Employee) i3.next();
        	if(emp2.getEmployeeId()==id) {
        		System.out.println("Enter new salary");
        		int ns= sc.nextInt();
        		emp2.setSalary(ns);
        		break;
        	}
        	
        }
        return true;
		
		
		
	}
	public static boolean editExp(int id) {
		Scanner sc= new Scanner(System.in);
		Iterator i4 = list.iterator();
		Employee emp3=(Employee) i4.next();
		while(i4.hasNext()) {
        	//System.out.println("i value"+i.getEmployeeId());
        	if(emp3.getEmployeeId()==id) {
        		System.out.println("Enter new experience");
        		int ns= sc.nextInt();
        		emp3.setExp(ns);
        		break;
        	}
        	
        }
        return true;
		
		
		
	}
	
}
