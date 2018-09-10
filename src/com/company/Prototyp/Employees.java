package com.company.Prototyp;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<Employee> employees;
    public Employees() {
        employees = new ArrayList<>();
    }
    public Employees(List<Employee> employees) {
        this.employees = employees;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employees tempEmployees = new Employees();
        for (Employee employee : this.employees) {
            tempEmployees.employees.add((Employee) employee.clone());
        }
        return tempEmployees;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employees) {
            stringBuilder.append(employee.toString());
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }
}
