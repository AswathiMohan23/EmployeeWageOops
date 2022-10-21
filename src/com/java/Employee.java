package com.java;

public class Employee {
    private final int ABSENT=0;
    private final int PRESENT=1;
    private int empId;
    private String name;

    private  int totalWorkingDays=20;
    private int empHours;


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

    @Override
    public String toString() {
        return "Employee{" +
                "ABSENT=" + ABSENT +
                ", PRESENT=" + PRESENT +
                ", empId=" + empId +
                ", name='" + name + '\'' +
                ", empHours=" + empHours +
                '}';
    }
}
