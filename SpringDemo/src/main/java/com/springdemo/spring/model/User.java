package com.springdemo.spring.model;

public class User {

    // Private field to store the first name
    private String lastName;
    // Private field to store the last name
    private String firstName;

    // Create a method to get tha Username
    public String getFirstName() { // Method to get the first name
        return firstName;
    }

    // Create a method to set the name
    public void setFirstName(String firstName) { // Method to set the first name
        this.firstName = firstName;
    }

    // method to get the last name
    public String getLastName() { // Method to get the last name
        return lastName;
    }

    // method to set the last name
    public void setLastName(String lastName) { // Method to set the last name
        this.lastName = lastName;
    }
}