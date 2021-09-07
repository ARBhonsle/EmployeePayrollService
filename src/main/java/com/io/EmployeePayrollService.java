package com.io;

import java.io.IOException;

/**
 * Employee Payroll Service System
 *
 */
public class EmployeePayrollService
{
    static EmployeeService service = new EmployeeService();

    public static void main( String[] args ) throws IOException {
        System.out.println( "Welcome to Employee Payroll Service System!" );
        service.readEmployeePayrollData();
        service.readEmployeePayrollData();
        service.readEmployeePayrollData();
        service.writeEmployeePayrollData();
    }
}
