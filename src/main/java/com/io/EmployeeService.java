package com.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<EmployeePayrollData> employeeDataList;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public EmployeeService(){
        this.employeeDataList = new ArrayList<>();
    }

    public EmployeeService(List<EmployeePayrollData> list){
        this.employeeDataList = list;
    }

    public void readEmployeePayrollData() throws IOException {
        System.out.println("Enter Employee Id:");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter Employee Name:");
        String name = br.readLine();
        System.out.println("Enter Employee Salary:");
        double salary = Double.parseDouble(br.readLine());
        employeeDataList.add(new EmployeePayrollData(id,name,salary));
    }

    public void writeEmployeePayrollData(){
        System.out.println("\nWriting Employee Payroll Data to console:154");
        for(EmployeePayrollData data : employeeDataList){
            System.out.println(data.getEmployeeId()+" "+data.getEmployeeName()+" "+data.getEmployeeSalary());
        }
    }
}
