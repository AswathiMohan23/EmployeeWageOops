package com.java;

import java.util.ArrayList;


public class CompanyEmpWageBuilder implements EmpBuilderInterface{
    Employee employee=new Employee();
    ArrayList wiproList=new ArrayList<>();
    ArrayList tcsList=new ArrayList<>();
    ArrayList boschList=new ArrayList<>();
@Override
    public void detailsOfWipro() {
        employee.setName("Tom");
        employee.setCompanyName("Wipro");
        employee.setWage("2000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(30);
        wiproList.add(employee.getName());
        wiproList.add(employee.getCompanyName());
        wiproList.add(employee.getWage());
        wiproList.add(employee.getWorkingHours());
        wiproList.add(employee.getTotalWorkingDays());
        System.out.println("Details of Wipro as list : "+wiproList);
        System.out.println("Details of Wipro : "+employee.toString());
    }
    @Override
    public void detailsOfTCS() {
        employee.setName("John");
        employee.setCompanyName("TCS");
        employee.setWage("5000");
        employee.setWorkingHours(30);
        employee.setTotalWorkingDays(20);
        tcsList.add(employee.getName());
        tcsList.add(employee.getCompanyName());
        tcsList.add(employee.getWage());
        tcsList.add(employee.getWorkingHours());
        tcsList.add(employee.getTotalWorkingDays());
        System.out.println("Details of TCS as list : "+tcsList);
        System.out.println("Details of bosch : "+employee.toString());
    }

    @Override
    public void detailsOfBosch() {
        employee.setName("Anna");
        employee.setCompanyName("bosch");
        employee.setWage("8000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(25);
        boschList.add(employee.getName());
        boschList.add(employee.getCompanyName());
        boschList.add(employee.getWage());
        boschList.add(employee.getWorkingHours());
        boschList.add(employee.getTotalWorkingDays());
        System.out.println("Details of Bosch as list : "+boschList);
        System.out.println("Details of bosch : "+employee.toString());
    }


}
