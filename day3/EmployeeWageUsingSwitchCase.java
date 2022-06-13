package com.practice.assignment;


import java.util.Scanner;

public class EmployeeWageUsingSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("select for which employee you need to calculate wages: ");
        System.out.println("1. Full Time Employee ");
        System.out.println("2. Part Time Employee ");

        int emptype = sc.nextInt();
        System.out.println("you selected : " + emptype);

        switch(emptype){
            case 1:
                EmployeeFullTime empf = new EmployeeFullTime();
                empf.employeeFullTime();
            break;
            case 2:
                EmployeePartTime empp = new EmployeePartTime();
                empp.employeePartTime();
            break;
            default:
                System.out.println("Employee is absent");





        }





    }

}
