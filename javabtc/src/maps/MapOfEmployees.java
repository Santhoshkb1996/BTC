package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class MapOfEmployees {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1001,"Mahesh",45000);
		Employee emp2=new Employee(1005, "Rohit", 65000);
		Employee emp3=new Employee(1002, "Arun", 55500);
		Employee emp4=new Employee(1003, "Jones", 62000);
		
//		List<Employee> employeeList = new ArrayList<>();
//		
//		employeeList.add(emp1);
//		employeeList.add(emp2);
//		employeeList.add(emp3);
//		
//		int empId = 1005;
//		Employee searchedEmp=null;
//		
//		for(Employee emp:employeeList) {
//			if(emp.getEmployeeId()==empId) {
//				searchedEmp=emp;
//			}
//		}
//		
//		System.out.println(searchedEmp);
		
		Map<Integer, Employee> employees=new HashMap<Integer, Employee>();
		
		employees.put(emp1.getEmployeeId(), emp1);
		employees.put(emp2.getEmployeeId(), emp2);
		employees.put(emp3.getEmployeeId(), emp3);
		employees.put(emp4.getEmployeeId(), emp4);
//		int empId = 1001;
//		Employee searchedEmp=employees.get(empId);
//		System.out.println(searchedEmp);
		
		
		// Display All the Values :
		
		for(int key:employees.keySet()) {
			System.out.println(employees.get(key));
		}
		
		
		
	}
	
}