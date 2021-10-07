package com.makhabatusen.employee;

public class Engineer implements  Employee{
    private  int salary;

    public Engineer(int salary) {
        this.salary = salary;
    }

    @Override
    public void getWorkingHours(int hours) {
        System.out.printf("\nWorking Hours: %s", hours);
    }
}
