package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


import com.btc.app.model.Employee;
import com.btc.app.ui.EmployeeAppUI;


public class EmployeeDaoJdbcImpl implements EmployeeDao {
	
	private Connection con;
	
	private PreparedStatement smt;
	
	
	public EmployeeDaoJdbcImpl() throws SQLException {
		con=ConnectionUtil.getDbConnection();
	}

	@Override
	public Employee addEmployee(Employee employee) throws SQLException, InvalidIdException {
		
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		//data
		String query1="select count(*) from newemployee where employeeId=?";
		smt=con.prepareStatement(query1);
		smt.setInt(1, employee.getEmployeeId());	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);
		
		if(count>0)
		{
			throw new InvalidIdException("Data already present");
		}
		
		//new code ends
		
		String query = "insert into newemployee values(?,?,?,?)";
		
		
		smt= con.prepareStatement(query);
		
		smt.setInt(1, employee.getEmployeeId());
		smt.setString(2, employee.getEmployeeName());
		smt.setString(3, dateString);
		smt.setString(4, employee.getEmail());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws SQLException, InvalidIdException {
		//new code
		String query1="select count(*) from newemployee where employeeId=?";
		smt=con.prepareStatement(query1);
		smt.setInt(1, employeeId);	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);
		if(count<1)
		{
			throw new InvalidIdException("Employee Id doesnot exist");
		}
		//ends
		
		String query="select * from newemployee where employeeId=?";
		smt=con.prepareStatement(query);
		
		smt.setInt(1, employeeId);	
		
		ResultSet queryResult = smt.executeQuery();
		
		Employee emp=null;
		
		if(queryResult.next()) {
			emp=new Employee();
			emp.setEmployeeId(employeeId);
			emp.setEmployeeName(queryResult.getString("employeeName"));
			emp.setEmail(queryResult.getString("email"));
			String dateString=queryResult.getString("datestring");
			emp.setDob(LocalDate.parse(dateString));
		}
		
		return emp;
		
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) throws SQLException, InvalidIdException {
		// TODO Auto-generated method stub
		//return false;
		//exception
		
		String query1="select count(*) from newemployee where employeeId=?";
		smt=con.prepareStatement(query1);
		smt.setInt(1, employeeId);	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);
		if(count<1)
		{
			throw new InvalidIdException("Employee Id doesnot exist");
		}
		
		
		//excption ends
		String query="delete  from newemployee where employeeId=?";
		
		smt=con.prepareStatement(query);
		smt.setInt(1, employeeId);
		smt.executeUpdate();
		System.out.println("record deleted successfully");
		return true;
//		ResultSet queryResult = smt.executeQuery();
//		
//		Employee emp=null;
//		
//		if(queryResult.next()) {
//			emp=new Employee();
//			emp.setEmployeeId(employeeId);
//			emp.setEmployeeName(queryResult.getString("employeeName"));
//			emp.setEmail(queryResult.getString("email"));
//			String dateString=queryResult.getString("datestring");
//			emp.setDob(LocalDate.parse(dateString));
//		}
		//return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee)throws SQLException, InvalidIdException {
		// TODO Auto-generated method stub
		//return null;
		//customized exception
		String query1="select count(*) from newemployee where employeeId=?";
		smt=con.prepareStatement(query1);
		smt.setInt(1, employee.getEmployeeId());	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);
		if(count<1)
		{
			throw new InvalidIdException("Employee Id doesnot exist");
		}
		//exception ends
		
		
		
		
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		
		String query="update NewEmployee set employeeName=?,datestring=?,email=? where employeeId=?";
		smt=con.prepareStatement(query);
		//Employee emp=null;
		smt.setString(1, employee.getEmployeeName());
		smt.setString(2, dateString);
		smt.setString(3, employee.getEmail());
		smt.setInt(4, employee.getEmployeeId());
		smt.executeUpdate();
		System.out.println("databse updated successfully");
		return null;
		
	}

	@Override
	public List<Employee> getAllEmployee()throws SQLException, InvalidIdException {
		// TODO Auto-generated method stub
		
		String query1="select count(*) from newemployee";
		smt=con.prepareStatement(query1);
		//smt.setInt(1, employeeId);	
		ResultSet c1=smt.executeQuery();
		c1.next();
		int count=c1.getInt(1);
		System.out.println("Total"+count);
		if(count<1)
		{
			throw new InvalidIdException("Employee Id doesnot exist");
		}
		String query="select * from newemployee";
		
		
		//smt.setInt(1, employeeId);	
		
		//ResultSet queryResult = smt.executeQuery();
		
		Employee emp=null;
		
		
		try{
				smt=con.prepareStatement(query);
			   //stmt = con.createStatement();
			   //String query = "SELECT * FROM user";
			   ResultSet rs=smt.executeQuery(query);
			   System.out.println("Employeeid"+"\t"+"EmpNam"+"Email"+"\t"+"dob"+"\t");
			   //Extact result from ResultSet rs
			   while(rs.next()){
					 System.out.println(""+rs.getInt("EmployeeId")+"\t"+rs.getString("EmployeeName")+"\t"+rs.getDate("datestring")+"\t"+rs.getString("Email"));				
				  }
			   // close ResultSet rs
			   rs.close();
			   } catch(SQLException s){						
					s.printStackTrace();
				 }
		return null;
	}

	
	
}