package com.sparta.gwilymt;

import java.util.HashMap;

public class DataHolder {
    HashMap<Integer, Employee> hashEmployees = new HashMap<>();

    public boolean searchById(int id) {

        if (hashEmployees.containsKey((Integer) id)) {
            System.out.println("Employee found with matching ID: ");
            Employee emp = hashEmployees.get(id);
            System.out.println(emp.getId() + ", " + emp.getTitle() + " " + emp.getFirstName() + " " + emp.getMiddleInitial() + " " + emp.getLastName() + ", " + emp.getGender() + ", " + emp.getEmail() + ", " + emp.getDateOfBirth() + ", " + emp.getJoinDate() + ", " + emp.getSalary());
            return true;
        }
        return false;
    }
}
