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
        employee.setWage("4000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(30);
        employee.setDailyWage("130");
        wiproList.add(employee.getName());
        wiproList.add(employee.getCompanyName());
        wiproList.add(employee.getWage());
        wiproList.add(employee.getWorkingHours());
        wiproList.add(employee.getTotalWorkingDays());
        wiproList.add(employee.getDailyWage());
        System.out.println("Details of Wipro as list : "+wiproList);
        System.out.println("Details of Wipro : "+employee.toString());
        getTotalWageByWipro();
    }
    @Override
    public void detailsOfTCS() {
        employee.setName("John");
        employee.setCompanyName("TCS");
        employee.setWage("8000");
        employee.setWorkingHours(30);
        employee.setTotalWorkingDays(20);
        employee.setDailyWage("250");
        tcsList.add(employee.getName());
        tcsList.add(employee.getCompanyName());
        tcsList.add(employee.getWage());
        tcsList.add(employee.getWorkingHours());
        tcsList.add(employee.getTotalWorkingDays());
        tcsList.add(employee.getDailyWage());
        System.out.println("Details of TCS as list : "+tcsList);
        System.out.println("Details of bosch : "+employee.toString());
        getTotalWageByTCS();
    }

    @Override
    public void detailsOfBosch() {
        employee.setName("Anna");
        employee.setCompanyName("bosch");
        employee.setWage("5000");
        employee.setWorkingHours(20);
        employee.setTotalWorkingDays(25);
        employee.setDailyWage("200");
        boschList.add(employee.getName());
        boschList.add(employee.getCompanyName());
        boschList.add(employee.getWage());
        boschList.add(employee.getWorkingHours());
        boschList.add(employee.getTotalWorkingDays());
        boschList.add(employee.getDailyWage());

        System.out.println("Details of Bosch as list : "+boschList);
        System.out.println("Details of bosch : "+employee.toString());
        getTotalWageByBosch();

    }

    @Override
    public void getTotalWageByWipro() {
        System.out.println("total wage in Wipro : "+ employee.getWage());
    }

    @Override
    public void getTotalWageByTCS() {
        System.out.println("total wage in TCS : "+ employee.getWage());
    }

    @Override
    public void getTotalWageByBosch() {
        System.out.println("total wage in Bosch : "+ employee.getWage());


    }


}
