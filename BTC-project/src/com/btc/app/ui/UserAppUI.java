package com.btc.app.ui;

import java.sql.SQLException;
import java.sql.SQLException;
import java.util.Scanner;

//import com.btc.app.model.Employee;
import com.btc.app.model.User;
import com.btc.app.service.UserServiceImpl;
import com.btc.app.service.UserService;
//import com.btc.app.service.UserServiceImpl;

public class UserAppUI {
	private Scanner scanner=new Scanner(System.in);
	private static UserService service;
	public UserAppUI() throws SQLException {
		service=new UserServiceImpl();
	}
	
//	public UserAppUI() {
//		super();
//	}

	public void addUser()
	{
		System.out.println("Enter User details ");
		System.out.print("User Id:");
		int userId=scanner.nextInt();
		System.out.print("User Name:");
		String userName=scanner.next()+scanner.nextLine();
		System.out.print("Password:");
		String Password=scanner.next()+scanner.nextLine();
		System.out.print("Favorite Category:");
		String favCat=scanner.next()+scanner.nextLine();
		User user=new User(userId,userName,Password,favCat);
		User savedUser;
		try {
			savedUser = service.addUser(user);
			System.out.println(savedUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User ADded successfully");
		
	}
	public void readNews() {
		System.out.println("Enter User Details :  ");
		System.out.print("User ID : ");
		int userid=scanner.nextInt();
		User user=null;
		try {
			user = service.readNews(userid);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("User Information\n"+user);
		
		//}
		//else
		//{
			//System.out.println("Employee doesnot exist");
		//}
	}
	

}
