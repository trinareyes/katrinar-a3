package com.coderscampus;
import java.io.BufferedReader;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class UserService {

	public static void main(String[] args) {
	     User[] users = new User[4]; 
	        int index = 0;
	        
		
	        try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {
	           
	        	
	        	 String line;
	             while ((line = fileReader.readLine()) != null) {
	            	 
	            	 
	                 Scanner scanner = new Scanner(line);
	                 if (scanner.hasNext()) {
	                     String username = scanner.next();
	                     if (scanner.hasNext()) {
	                         String password = scanner.next();
	                         if (scanner.hasNext()) {
	                             String name = scanner.next();
	                             User user = new User(username, password, name);
	                             users[index] = user;
	                             index++;
	                         }
	                     }
	                 }
	                 scanner.close();
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your username: ");
			String enteredUsername = scanner.nextLine();
			System.out.println("Enter your password: ");
			String enteredPassword = scanner.nextLine();
			
			
			 boolean isValidUser = false;
			 for (User user : users) {
	                if (user != null && user.getUsername().equals(enteredUsername) && user.getPassword().equals(enteredPassword)) {
	                    System.out.println("Welcome " + user.getName());
	                    isValidUser = true;
	                    break;
	                }
			        }
			 
			  if (!isValidUser) {
	                System.out.println("Invalid login, please try again.");
	            }
		}
	}
}

			