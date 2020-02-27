package com.sparta.gwilymt;


public class Employee {
    int employeeId;
    String employeeTitle;
    String employeeFirstName;
    char employeeMiddleInitial;
    String employeeLastName;
    char employeeGender;
    String employeeEmail;
    String employeeDateOfBirth;
    String employeeJoinDate;
    int employeeSalary;

    //Constructor
    public Employee(String[] variable) {
        this.employeeId = Integer.parseInt(variable[0]);
        this.employeeTitle = variable[1];
        this.employeeFirstName = variable[2];
        this.employeeMiddleInitial = variable[3].charAt(0);
        this.employeeLastName = variable[4];
        this.employeeGender = variable[5].charAt(0);
        this.employeeEmail = variable[6];
        this.employeeDateOfBirth = variable[7];
        this.employeeJoinDate = variable[8];
        this.employeeSalary = Integer.parseInt(variable[9]);

    }

    // getters
    public int getId() {
        return this.employeeId;
    }

    public String getTitle() {
        return this.employeeTitle;
    }

    public String getFirstName() {
        return this.employeeFirstName;
    }

    public char getMiddleInitial() {
        return this.employeeMiddleInitial;
    }

    public String getLastName() {
        return this.employeeLastName;
    }

    public char getGender() {
        return this.employeeGender;
    }

    public String getEmail() {
        return this.employeeEmail;
    }

    public String getDateOfBirth() {
        return this.employeeDateOfBirth;
    }

    public String getJoinDate() {
        return this.employeeJoinDate;
    }

    public int getSalary() {
        return this.employeeSalary;
    }

    public void returnEmployees() {
        System.out.println(getId() + "" + getTitle() + getTitle() + "" + getFirstName() + getMiddleInitial() +
                "" + getLastName() + "" + getGender() + getEmail() + "" + getDateOfBirth() + getJoinDate() + "" + getSalary());
    }
}