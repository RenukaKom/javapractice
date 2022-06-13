package com.practice.assignment;

public class CalculateDailyWages {
    public static void main(String[] args) {
        int isPresent = 1;
        double empCheck = Math.floor(Math.random() * 10 % 2);
        System.out.println(empCheck);
        if (empCheck == isPresent) {
            double empRatePerHour =20;
            int empFullHrs =8;
            double salary = (empRatePerHour * empFullHrs);
            System.out.println(salary);
        }

    }
}
