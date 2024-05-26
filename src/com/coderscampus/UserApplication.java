package com.coderscampus;

import java.util.Scanner;

public class UserApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userService = new UserService();
		
		
		System.out.println("Enter your username");
		String username = scanner.nextLine();
		
		
		System.out.println("Enter your password:");
		String password = scanner.nextLine();
		
		
	
		
		String[] stringInput = new String[2];
		stringInput[0] = username;
		stringInput[1] = password;
		
		User user = userService.createUser(stringInput);
		System.out.println("User created: " + user);
		
		scanner.close();

}
}