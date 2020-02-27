package com.sparta.gwilymt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader {
    public static void readFileToString(DataHolder list, DirtyDataHolder dirtyList, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            reader.readLine(); // reads first line of file but does not print it (field names not needed)
            String line;
            while ((line = reader.readLine()) != null) { //while the line read is not null
                // System.out.println(Arrays.toString(line.split(","))); //creates split in records at every instance there is a comma
                String[] variables = line.split(",");
                if (variables[7].length() != 10) {
                    DirtyData emp = new DirtyData(variables, "Invalid date of birth format");
                    dirtyList.hashEmployees.putIfAbsent(Integer.parseInt(variables[0]), emp);
                } else if (variables[8].length() != 10) {
                    DirtyData emp = new DirtyData(variables, "Invalid join date format");
                    dirtyList.hashEmployees.putIfAbsent(Integer.parseInt(variables[0]), emp);
                } else {
                    Employee emp = new Employee(variables);
                    list.hashEmployees.putIfAbsent(Integer.parseInt(variables[0]), emp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
