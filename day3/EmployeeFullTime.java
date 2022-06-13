package com.practice.assignment;

public class EmployeeFullTime {
    double empRatePerHour = 20;
    int empFullHrs = 12;
    double salary = (empRatePerHour * empFullHrs);



    public static void employeeFullTime(){
        double empRatePerHour = 20;
        int empFullHrs = 12;
        double salary = (empRatePerHour * empFullHrs);
        System.out.println(salary);
    }


}






/*
public static void main(String[] args) {
        double empCheck = Math.floor(Math.random() * 10 % 2);
        System.out.println(empCheck);
        EmployeeFullTime empf = new EmployeeFullTime();
        empf.employeeFullTime();
        EmployeePartTime empp = new EmployeePartTime();
        empp.employeePartTime();

    }
}
 */