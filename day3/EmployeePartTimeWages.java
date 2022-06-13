package com.practice.assignment;

public class EmployeePartTimeWages {
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
        } else if (empCheck == isPartTime) {
            double empRatePerHour = 20;
            int empPartHrs = 8 ;
            double partTimeSalary = (empRatePerHour * empPartHrs);
            System.out.println(partTimeSalary);
        }
        else{
            System.out.println("employee is absent");
        }
        }
    }




