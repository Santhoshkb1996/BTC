package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Employee;
//import com.btc.app.service.EmployeeServiceImpl;

class EmployeeDaoImplTest {

	EmployeeDao dao=new EmployeeDaoImpl();
	
	
	//@disabled
	@Test
	void testAddEmployee() throws Exception {
		Employee emp=new Employee(1006,"Uttam Reddy",LocalDate.parse("1994-02-10"),"uttam@gmail.com");
		assertEquals(emp, dao.addEmployee(emp));
	}

	@Test
	void testSearchEmployeeById() throws Exception {
		//Employee emp= service.searchEmployeeById(1006);
		//assertEquals(emp,dao.searchEmployeeById(emp));
		//Employee employee = service.searchEmployeeById(100);
		//Employee emp=new Employee(1006,"Uttam Reddy",LocalDate.parse("1994-02-10"),"uttam@gmail.com");
		//dao.addEmployee(emp);
		assert(dao.searchEmployeeById(1006)!=null);
	}

	@Test
	void testDeleteEmployeeById() throws Exception {
		assertTrue(dao.deleteEmployeeById(1006));
	}

	@Test
	void testUpdateEmployee() throws Exception {
		Employee emp=new Employee(1006,"Uttam Reddy",LocalDate.parse("1994-02-10"),"uttam@gmail.com");
		assertEquals(emp, dao.updateEmployee(emp));
	}

	@Test
	void testGetAllEmployee() {
		//List<Integer> copy = new ArrayList<>(emps);
		//Employee emp=dao
		
	}

}