package com.btc.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.btc.app.ui.UserAppUI;

public class UserAppRunner {
	public static void main(String[] args) throws SQLException {
		UserAppUI appUI=new UserAppUI();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add User\t 2.readnews\t 2.Exit");
			int option=scanner.nextInt();
			switch(option)
			{
			case 1:appUI.addUser();
			break;
			case 2:appUI.readNews();
			break;
			case 3:System.exit(1);
			break;
			default:
				System.out.println("WRong option");
				//throw new IlleagalArgumentException("Wrong option")
			
			}
			System.out.println("\n");
		}
	}

}
