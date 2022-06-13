package com.practice.assignment;

public class CalculateMonthWages {
    public static void main(String[] args) {
        int isFullTime = 1;
        int isPartTime = 2;
        double empCheck = Math.floor(Math.random() * 10 % 3);
        System.out.println(empCheck);
        if (empCheck == isFullTime) {
            double empRatePerHour = 20;
            int empFullHrs = 12;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println(salary);
            double totalSalary = salary * 30;
            System.out.println("todal salary of month is : " + totalSalary);
        } else if (empCheck == isPartTime) {
            double empRatePerHour = 20;
            int empPartHrs = 8 ;
            double salary = (empRatePerHour * empPartHrs);
            System.out.println(salary);
            double totalSalary = salary * 30;
            System.out.println("todal salary of month is : " + totalSalary);
        }
        else{
            System.out.println("employee is absent");
        }

    }
}

