package SolveProblem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        
		employeeList.add(new Employee(100, "Mech", 200, 300, "Hardhik","Pandya","Pandya@gmail.com",4234335, 1996, "Clerk", 10000, 28, "Male", 201));
		employeeList.add(new Employee(101, "Mech", 201, 301, "KL","Rahul","KL@gmail.com",425335, 1990, "Director", 100000, 28, "Male", 205));
		employeeList.add(new Employee(102, "Civil", 202, 302, "Saachim","T","sachjin@gmail.com",426534335, 2010, "HOD", 45000, 40, "Male", 203));
		employeeList.add(new Employee(103, "EE", 203, 303, "MS","Dhoni","DHoni@gmail.com",42576335, 2015, "ASStDirector", 450000, 34, "Male", 204));
		employeeList.add(new Employee(104, "IS", 204, 304, "Steven","Smith","Steve@gmail.com",564234335, 2019, "Manager", 8900, 33, "Male", 207));
		employeeList.add(new Employee(105, "EC", 205, 305, "Kane","Wiiliiamson","willianmson@gmail.com",785335, 2015, "Clerk", 106500, 35, "Male", 208));
		
		employeeList.stream().map(Employee::getDepname).distinct().forEach(System.out::println);
		double total=employeeList.stream().map(Employee::getSalary).reduce((val1,val2)->(val1+val2)).get();
		System.out.println("Total"+total);
		Map<String, Long> employeeCountByDepartment=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepname, Collectors.counting()));
		System.out.println(employeeCountByDepartment);
		//Employee seniorMostEmployee = employeeList.stream().min(Comparator.comparing(Employee::gethiredate)).get();
		//int seniorMostEmployee =employeeList.stream().sorted(Comparator.comparingInt(Employee::gethiredate)).findFirst().get();
}
}
