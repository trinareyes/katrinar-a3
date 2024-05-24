package com.coderscampus;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader fileReader = null;
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
			fileReader.close();
			
			
		} catch (FileNotFoundException e) {
			  System.out.println("oops, there was an exception");
			e.printStackTrace();
		} finally {
			fileReader.close();
		}
}
}