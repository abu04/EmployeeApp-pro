package com.capgemini.empapp.main;

import java.util.*;

import com.capgemini.empapp.db.EmployeeDB;
import com.capgemini.empapp.dto.Employee;
import com.capgemini.empapp.main.EmpMainClass;
import com.capgemini.empapp.service.EmployeeServiceImpl;
import com.capgemini.empapp.service.IEmployeeService;

public class EmpMainClass {
IEmployeeService empService = new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		
		EmpMainClass app = new EmpMainClass();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" === MUNU ==== ");
			System.out.println("1. add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Display All Employee based on salary ");
			System.out.println("4. Display All Employee based on salary range");
			System.out.println("5. Edit Employee salary");
			System.out.println("6. Edit Employee Experience ");
			System.out.println("0. EXIT");
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch(option)
			{
			
			case 1:
				
				System.out.println("Enter Employee Id ");
				int empId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empSalary = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Exp ");
				int empExp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();
				
				Employee e = new Employee(empId, name, empExp, empSalary);
				
				try
				{
					boolean isInserted = app.empService.addEmployee(e);
					if(isInserted)
					{
						System.out.println(" Employee Added !!!");
					}
					else
					{
						 throw new Exception("Cannot added Employee ...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				
				break;
			case 2:
				
				List<Employee> all= new ArrayList();
				all.addAll(app.empService.getAllEmployees());
				Iterator it= all.iterator();
				while(it.hasNext()) {
				System.out.println(it.next());
				}
				break;
				
			case 0:
				System.exit(0);
				
			case 3:
				int c = EmployeeDB.c;
				System.out.println("Enter Salary");
				int s= sc.nextInt();
				sc.nextLine();
				List<Employee> li = new ArrayList<Employee>();
				li.addAll(app.empService.getEmployeeBySalary(s));
				
				System.out.println(li);
				break;
				
			case 4:
				System.out.println("Enter min and max Salary");
				int smin= sc.nextInt();
				int smax= sc.nextInt();

				sc.nextLine();
				List<Employee> lis = new ArrayList<Employee>();
				lis.addAll(app.empService.getEmployessBySalaryRange(smin,smax));
				System.out.println(lis);
				
				break;
			case 5:
				System.out.println("enter id:");
				int id= sc.nextInt();
				sc.nextLine();
				try
				{
					boolean isEdited = app.empService.editSalaryByEmployeeId(id);
					if(isEdited)
					{
						System.out.println(" Employee Salary Edited !!!");
					}
					else
					{
						 throw new Exception("Cannot edit Employee ...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				
				break;
			case 6:
				System.out.println("enter id:");
				int eid= sc.nextInt();
				sc.nextLine();
				try
				{
					boolean isEdited = app.empService.editExpByEmployeeId(eid);
					if(isEdited)
					{
						System.out.println(" Employee Experience Edited !!!");
					}
					else
					{
						 throw new Exception("Cannot edit Employee ...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				
				break;
				
			
			
			
			}//end switch
			
		}// end while
		
		
		
	}//end main

}
