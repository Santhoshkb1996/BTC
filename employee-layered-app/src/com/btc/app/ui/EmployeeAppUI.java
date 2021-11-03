package com.btc.app.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.btc.app.model.Employee;
import com.btc.app.service.EmployeeService;
import com.btc.app.service.EmployeeServiceImpl;

public class EmployeeAppUI {
	
	Map<Integer, Employee> employees=new HashMap<Integer, Employee>();
	Employee employee=new Employee();
	private Scanner scanner=new Scanner(System.in);
	private static EmployeeService service;
	public EmployeeAppUI() throws SQLException {
		service=new EmployeeServiceImpl();
	}
	
	public void addEmployee() throws InvalidDataException {
		int employeeId;
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		try {
		employeeId=scanner.nextInt() ;
		if(employeeId<1000)
		{
			throw new InvalidDataException("Enter the EmployeeId greater than 999");
		}
		employee.setEmployeeId(employeeId);
		}
		catch(InputMismatchException e){
		System.out.println("Please enter integer");
		}

//		if(employees.containsKey(employeeId))
//		{
//			System.out.println("Employee already exist");
//		}
//		else {
		try {
		System.out.print("Employee Name : ");
		String employeeName=scanner.next()+scanner.nextLine();
		if(employeeName.length()<3)
			{
				throw new InvalidDataException("Please enter proper name");
			}
			employee.setEmployeeName(employeeName);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter in string");
			}
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();
		employee.setEmail(email);
		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();
		
		
		LocalDate dob=LocalDate.parse(dobString);
		employee.setDob(dob);
		//employee= new Employee(employeeId, employeeName, dob, email);
		employees.put(employee.getEmployeeId(), employee);
		Employee savedEmployee;
		try {
			savedEmployee = service.addEmployee(employee);
			System.out.println("Employee Added Successfully..");
			System.out.println(savedEmployee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//}
	}
	
	
	public void showEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		//if(employees.containsKey(employeeId))
		//{
		Employee employee=null;
		try {
			employee = service.searchEmployeeById(employeeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(employee);
		//}
		//else
		//{
			//System.out.println("Employee doesnot exist");
		//}
	}
	
	public void deleteEmployee() {
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		//if(employees.containsKey(employeeId))
		//{
			try {
				boolean employee=service.deleteEmployeeById(employeeId);
				System.out.println("Employee deleted successfully");
				employees.remove(employeeId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("Employee deleted successfully");
			//employees.remove(employeeId);
		//}
		//else
		//{
			//System.out.println("EmployeeId doesnot exist");
		//}
		
	}	
	public void allEmployee()
	{
		List<Employee> emp=null;
		try {
			emp = service.getAllEmployee();
			System.out.println(emp);
			System.out.println("hello");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void updateEmployee()
	{
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		//if(employee.getEmployeeId()==employeeId)
		//{
		//List<Employee> emp=service.getAllEmployee();
		//Map<Integer, Employee> employees=new HashMap<Integer, Employee>();
		
//		employees.put(emp1.getEmployeeId(), emp1);
//		employees.put(emp2.getEmployeeId(), emp2);
//		employees.put(emp3.getEmployeeId(), emp3);
//		employees.put(emp4.getEmployeeId(), emp4);
//		
		//while(true)
//		{
//			System.out.println("Enter empid");
//			int employeeId=scanner.nextInt();
//		}
		//Employee es=(Employee)emp.get(employeeId);
		
		//System.out.println(es);
		//Employee employee = service.searchEmployeeById(employeeId);
		//if(employee)
	//	if(employees.containsKey(employeeId))
		//{
			employee.setEmployeeId(employeeId);
			//System.out.println("Enter Name")
			System.out.print("Employee updated Name : ");
			String employeeName=scanner.next()+scanner.nextLine();
			employee.setEmployeeName(employeeName);
			System.out.print("updated Email : ");
			String email=scanner.next()+scanner.nextLine();
			employee.setEmail(email);
			System.out.print("Birth Date [yyyy-mm-dd] : ");
			String dobString=scanner.next()+scanner.nextLine();
			
			LocalDate dob=LocalDate.parse(dobString);
			employee.setDob(dob);
			
			employee= new Employee(employeeId, employeeName, dob, email);
			try {
				service.updateEmployee(employee);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	//	}
			employees.put(employee.getEmployeeId(), employee);
			//System.out.println("Updated Successfully");
	
//	catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	//	}
		//else
		//{
		//	System.out.println("EmployeeId doesnot exist");
		//}
		
			
		
	}
	
	
}
