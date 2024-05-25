package com.coderscampus;

public class UserApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		UserService userService = new UserService();
		
		String[] stringInput = new String[3];
		stringInput [0] = "";
		stringInput [1] = "";
		stringInput [2] = "";

		User user = userService.createUser(stringInput);
		
	System.out.println(user);

}
}