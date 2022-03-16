package com.FunctionalInerface;

public class Employee{
    double salary;
    String name;

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    public void updateSal(double upd){
        this.salary+=upd;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
