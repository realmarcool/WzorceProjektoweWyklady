package com.company.Prototyp;

import java.util.ArrayList;
import java.util.List;

public class JobPlace {
    public static void run() throws CloneNotSupportedException {
        Human human = new Human("Jan", "Kowalski", 45);
        Employee employee = new Employee(human, "director", 100000f);
        Human human1 = new Human("Zbigniew", "Kałamaga", 56);
        Employee employee1 = new Employee(human1, "hr", 3500f);
        Employee employee2 = (Employee) employee.clone();
        employee2.setSalary(45000);
        employee2.setJobPosition("driver");
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(employee);
        employeesList.add(employee1);
        Employees employees = new Employees();
        employees.setEmployees(employeesList);
        Employees employees1 = (Employees) employees.clone();
        employees1.setEmployees(new ArrayList<>());
        System.out.println("--------Listy---------");
        System.out.println(employees);
        System.out.println(employees1);
    }
}