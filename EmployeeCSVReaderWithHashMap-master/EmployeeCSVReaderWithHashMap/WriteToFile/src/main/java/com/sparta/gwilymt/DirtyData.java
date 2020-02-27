package com.sparta.gwilymt;

public class DirtyData extends Employee {
    String errorMessage;

    public DirtyData(String[] variable, String error) {
        super(variable);
        this.errorMessage = error;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}