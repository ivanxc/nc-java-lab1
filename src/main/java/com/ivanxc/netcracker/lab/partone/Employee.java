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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary
            && firstName.equals(employee.firstName) && lastName.equals(lastName);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(id);
        result = 31 * result + Integer.hashCode(salary);
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName .hashCode();
        return result;
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
