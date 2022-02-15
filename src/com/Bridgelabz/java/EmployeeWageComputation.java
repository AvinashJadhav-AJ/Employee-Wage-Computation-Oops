package com.Bridgelabz.java;

import java.util.Random;

class Employee {
    static final int IS_FULL_TIME = 1;

    public static void empCheck() {
	Random random = new Random();
	int empCheck = random.nextInt(2);
	if (empCheck == IS_FULL_TIME) {
	    System.out.println("PRESENT");
	} else {
	    System.out.println("ABSENT");
	}
    }
}

public class EmployeeWageComputation {

    public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program Object Orinted Program");
	Employee.empCheck();
    }

}
