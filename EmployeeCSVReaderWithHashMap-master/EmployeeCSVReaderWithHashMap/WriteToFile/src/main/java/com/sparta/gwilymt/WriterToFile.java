package com.sparta.gwilymt;

import java.io.*;

public class WriterToFile {
    public static void writeToCleanFile(DataHolder employees, String file) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Gwilym Turner\\Documents\\Mini Project\\" + file);
            employees.hashEmployees.entrySet().forEach(entry -> {
                try {
                    writer.write(entry.getValue().getId() + ", " + entry.getValue().getTitle() + " " + entry.getValue().getFirstName() + " " + entry.getValue().getMiddleInitial() + " " + entry.getValue().getLastName() + ", " + entry.getValue().getGender() + ", " + entry.getValue().getEmail() + ", " + entry.getValue().getDateOfBirth() + ", " + entry.getValue().getJoinDate() + ", " + entry.getValue().getSalary() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void writeToDirtyFile(DirtyDataHolder employees, String file) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Gwilym Turner\\Documents\\Mini Project\\" + file);
            employees.hashEmployees.entrySet().forEach(entry -> {
                try {
                    writer.write(entry.getValue().getId() + ", " + entry.getValue().getTitle() + " " + entry.getValue().getFirstName() + " " + entry.getValue().getMiddleInitial() + " " + entry.getValue().getLastName() + ", " + entry.getValue().getGender() + ", " + entry.getValue().getEmail() + ", " + entry.getValue().getDateOfBirth() + ", " + entry.getValue().getJoinDate() + ", " + entry.getValue().getSalary() + entry.getValue().getErrorMessage() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
