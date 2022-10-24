package com.java;

public class Employee {
    private final int ABSENT=0;
    private final int PRESENT=1;
    private int empId;
    private String name;
    private String companyName;
    private String wage;
    private int workingHours;
    private  int totalWorkingDays=20;
    private int empHours;

    public Employee() {

    }


    public int getABSENT() {
        return ABSENT;
    }

    public int getEmpHours() {
        return empHours;
    }

    public void setEmpHours(int empHours) {
        this.empHours = empHours;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }


    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getPRESENT() {
        return PRESENT;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee( String name, String companyName,int empId, String wage, int workingHours, int totalWorkingDays) {
        this.empId = empId;
        this.name = name;
        this.companyName = companyName;
        this.wage = wage;
        this.workingHours = workingHours;
        this.totalWorkingDays = totalWorkingDays;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", wage='" + wage + '\'' +
                ", workingHours=" + workingHours +
                ", totalWorkingDays=" + totalWorkingDays +
                '}';
    }
}

