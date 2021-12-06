package streamapi;

import java.util.ArrayList;
import java.util.List;

import maps.Employee;

public class EmployeeId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<String> name=new ArrayList<>();

		Employee emp1=new Employee(1001,"Mahesh",45000);
		Employee emp2=new Employee(1005, "Rohit", 65000);
		Employee emp3=new Employee(1002, "Arun", 55500);
		Employee emp4=new Employee(1003, "Jones", 62000);
		
		List<Employee> employeeList = new ArrayList<>();
	
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		employeeList.stream().filter(employee->employee.getEmployeeId()==1001).map(Employee::getEmployeeName).forEach(System.out::println);


	}

}
