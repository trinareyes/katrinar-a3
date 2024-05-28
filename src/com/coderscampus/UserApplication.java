package com.coderscampus;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		
	
		
		User[] users = userService.readUsersFromFile("data.txt");
		
		int maxattempts = 5;
		
		for (int attempts = 1; attempts <= maxattempts; attempts++) {
			System.out.println("Enter your username:");
		
		String enteredUsername = scanner.nextLine();
		
		
		System.out.println("Enter your password:");
		String enteredPassword = scanner.nextLine();
		
		User matchedUser = userService.validateUser(users, enteredUsername, enteredPassword);

		 if (matchedUser != null) {
	            System.out.println("Welcome " + matchedUser.getName());
	            break;
	        } else {
	        	if (attempts < maxattempts) {
	        		System.out.println("Invalid login. Please try again.");
	        	
	        } else {
	            System.out.println("Too many afiled login attemps, you are now locked out");
	        }
	        }
		}
	
		scanner.close();
	}
}