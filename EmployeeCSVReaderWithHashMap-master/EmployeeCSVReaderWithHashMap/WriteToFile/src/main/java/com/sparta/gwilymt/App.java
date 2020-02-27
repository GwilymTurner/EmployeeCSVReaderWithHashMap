package com.sparta.gwilymt;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Users\\Gwilym Turner\\Documents\\Mini Project\\CSV Records\\Test Records.csv"; //Change depending on where record are kept
        DataHolder list = new DataHolder();
        DirtyDataHolder dirtyList = new DirtyDataHolder();
        CSVFileReader.readFileToString(list, dirtyList, path);
        list.searchById(684725);
        list.searchById(338798);
        WriterToFile.writeToCleanFile(list, "Clean Data.txt");
        WriterToFile.writeToDirtyFile(dirtyList, "Dirty Data.txt");
    }
}
