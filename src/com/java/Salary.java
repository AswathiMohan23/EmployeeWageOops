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
        Employee employee1=new Employee("tom","wipro",1,"2000",20,30);
        Employee employee2=new Employee("John","tcs",3,"5000",30,20);
        Employee employee3=new Employee("Anna","bosch",1,"8000",20,25);
        System.out.println("\nwages for different companies: \n"+employee1.toString()+"\n"+employee2.toString()+"\n"+employee3.toString()+"\n");
    }
}
