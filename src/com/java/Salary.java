package com.java;

public class Salary {
    static Employee employee=new Employee();

    public static void main(String[] args) {
        int totalMonthlyHours = 0;
        int totalWorking_days = 0;
        employee.setName("Tom");
        employee.setEmpId(1);
        int totalWorkingDays;
        do {
            double check = Math.floor(Math.random() * 10) % 2;
            switch ((int) check) {
                case 1:
                    System.out.println("full time worker ");
                    employee.setEmpHours(100);
                    break;
                case 0:
                    System.out.println("part time worker");
                    employee.setEmpHours(80);  //obtained from uc 3 part time hour =8....8*10=80
                    break;                      //assumed monthly partime days =10
                default:
                    employee.setEmpHours(0);
            }
            totalMonthlyHours = totalMonthlyHours + employee.getEmpHours();
            int monthlyWage = totalMonthlyHours * 20;
            System.out.println("monthlyWage = " + monthlyWage);
            totalWorkingDays = employee.getTotalWorkingDays();
        }
        while ((totalMonthlyHours < 100) && (totalWorkingDays <= 20));
        multipleCompaniesEmpWage();
    }

    public static void multipleCompaniesEmpWage(){
        EmpWageBuilderWipro wipro=new EmpWageBuilderWipro();
        EmpWageBuilderTCS tcs=new EmpWageBuilderTCS();
        EmpWageBuilderBosch bosch=new EmpWageBuilderBosch();
        wipro.totalWageAndDetails();
        tcs.totalWageAndDetails();
        bosch.totalWageAndDetails();
    }
}
