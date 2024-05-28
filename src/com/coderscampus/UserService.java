package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

    public User[] readUsersFromFile(String filename) {
        User[] users = new User[4];
        int index = 0;

        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                users[index++] = createUserFromLine(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return users;
    }

    private User createUserFromLine(String line) {
        String[] parts = line.split(",");
        return new User(parts[0], parts[1], parts[2]);
    }

    public User validateUser(User[] users, String enteredUsername, String enteredPassword) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(enteredUsername) && user.getPassword().equals(enteredPassword)) {
                return user;
            }
        }
        return null;
    }
}

			