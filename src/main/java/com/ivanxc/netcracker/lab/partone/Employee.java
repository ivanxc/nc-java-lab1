package com.ivanxc.netcracker.lab.partone;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int percent) {
        salary *= 1.0 + (0.01 * percent);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
            "id=" + id +
            ", lastName='" + getName() + '\'' +
            ", salary=" + salary +
            ']';
    }
}