package com.java;

public class EmpWageBuilderBosch {
    Employee employee=new Employee();
    Employee employee3=new Employee("Anna","bosch",1,"8000",20,25);

    public void totalWageAndDetails() {
        employee.setName("Anna");
        employee.setCompanyName("bosch");
        employee.setWage("8000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(25);
        System.out.println("Details of bosch : "+employee.toString());
    }
}
