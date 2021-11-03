package com.btc.app;

import java.sql.SQLException;
import java.util.Scanner;

import com.btc.app.ui.EmployeeAppUI;
import com.btc.app.ui.InvalidDataException;

public class EmployeeAppRunner {

	public static void main(String[] args) throws InvalidDataException {
		Scanner scanner = new Scanner(System.in);
		EmployeeAppUI appUI =null;
		try {
			appUI = new EmployeeAppUI();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (true) {
			System.out.println("Enter a option :\n [1 - Add Employee] \n [2 - Search Employee] \n [3 - Delete Employee] \n [4 - Update Employee] \n [5 - All Employee] \n [0 - Exit]");
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				appUI.addEmployee();
				break;
			case 2:
				appUI.showEmployee();
				break;
			case 3:
				appUI.deleteEmployee();
				break;
			case 4:
				appUI.updateEmployee();
				break;
			case 5:
				appUI.allEmployee();
				break;

			case 0:
				System.exit(1);
				break;

			default:
				throw new IllegalArgumentException("Invalid Option: " + option);
			}

			System.out.println("\n");

		}

	}
}
