package com.io;

public class EmployeePayrollData {
    private String employeeName;
    private int employeeId;
    private double employeeSalary;

    public EmployeePayrollData(int id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
}
