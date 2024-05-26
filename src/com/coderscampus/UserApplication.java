package com.coderscampus;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		
		User[] users = userService.getUsersFromFile();
		System.out.println("Enter your username:3");
		String username = scanner.nextLine();
		
		
		System.out.println("Enter your password:");
		String password = scanner.nextLine();
		
		
		
		String[] stringInput = new String[2];
		stringInput[0] = username;
		stringInput[1] = password;
		
		
		for (User user : users) {
			if (user != null && user.getUsername().equals(username) && user.getPassword().equals(password)) {
				System.out.println(" " + user.getName());
				break;
			}
		}
		
		
		
		User user = userService.createUser(stringInput);
		System.out.println("User created: " + user);
		
		scanner.close();

}
}