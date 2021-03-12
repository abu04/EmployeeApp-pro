package com.capg.empapp.main;

import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.service.EmployeeServiceImpl;
import com.capg.empapp.service.IEmployeeService;

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
				
				Employee arr[] = app.empService.getAllEmployees();
				int count = EmployeeDB.count;  // not the code
				System.out.println("  --->>  count in main "+count);
				for (int i = 0; i < count; i++) {
					System.out.println(arr[i]);
					System.out.println(" ========================================================");
				}
				break;
			case 0:
				System.exit(0);
				
			case 3:
				int c = EmployeeDB.c;
				System.out.println("Enter Salary");
				int s= sc.nextInt();
				sc.nextLine();
				Employee ar[] = app.empService.getEmployeeBySalary(s);
				
				for (int i=0;i<ar.length;i++) {
					System.out.println(ar[i]);
				}
				break;
				
			case 4:
				System.out.println("Enter min and max Salary");
				int smin= sc.nextInt();
				int smax= sc.nextInt();

				sc.nextLine();
				Employee sr[] = app.empService.getEmployessBySalaryRange(smin,smax);
				for (int i=0;i<sr.length;i++) {
					System.out.println(sr[i]);
				}
				
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

}//end class
