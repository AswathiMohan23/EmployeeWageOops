package com.java;

public class EmpWageBuilderTCS {
    Employee employee=new Employee();

    public void totalWageAndDetails() {
        employee.setName("John");
        employee.setCompanyName("TCS");
        employee.setWage("5000");
        employee.setWorkingHours(30);
        employee.setTotalWorkingDays(20);
        System.out.println("Details of TCS : "+employee.toString());
    }
}
