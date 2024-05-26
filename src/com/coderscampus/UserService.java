package com.coderscampus;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader fileReader = null;
		try {
			 fileReader = new BufferedReader(new FileReader("data.txt"));
			 System.out.println(fileReader.toString());
			
			
		} catch (FileNotFoundException e) {
			  System.out.println("oops, there was an exception");
			e.printStackTrace();
		} finally {
			try {
				System.out.println("closing file reader");
				fileReader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

		   public User createUser(String[] stringInput) {
		        User user = new User();
		        user.setUsername(stringInput[0]);
		        user.setPassword(stringInput[1]);
		        user.setName(stringInput[2]);
		        return user;
		    }		
		
		
			
	}
