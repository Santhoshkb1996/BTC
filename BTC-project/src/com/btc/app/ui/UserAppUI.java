package com.btc.app.ui;

import java.sql.SQLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.btc.app.model.Employee;
import com.btc.app.model.User;
import com.btc.app.service.UserServiceImpl;
import com.btc.app.service.UserService;
//import com.btc.app.service.UserServiceImpl;

public class UserAppUI {
	private Scanner scanner=new Scanner(System.in);
	private static UserService service;
	User user=new User();
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
		user.setUserid(userId);
		System.out.print("User Name:");
		String userName=scanner.next()+scanner.nextLine();
		user.setUsername(userName);
		System.out.print("Password:");
		String Password=scanner.next()+scanner.nextLine();
		user.setPassword(Password);
		System.out.print("Favorite Category:");
		List<String> favCategory=new ArrayList<>();
		favCategory.add("crime");
		favCategory.add("Entertainment");
		while(true)
		{	
		String favCat=scanner.next()+scanner.nextLine();
		if(favCategory.contains(favCat))
		{
			user.setFavCategory(favCat);
			break;
		}
		System.out.println("Enter favorite category in below list");
		favCategory.forEach((k)->System.out.println(k));
		}
		//user=new User(userId,userName,Password,favCat);
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
