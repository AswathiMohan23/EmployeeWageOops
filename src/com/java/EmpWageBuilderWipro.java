package com.java;

public class EmpWageBuilderWipro {
    Employee employee=new Employee();

    public void totalWageAndDetails() {
        employee.setName("Tom");
        employee.setCompanyName("Wipro");
        employee.setWage("2000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(30);
        System.out.println("Details of Wipro : "+employee.toString());
    }
}
