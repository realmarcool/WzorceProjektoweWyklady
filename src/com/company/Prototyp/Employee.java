package com.company.Prototyp;

public class Employee implements Cloneable{
    private Human human;
    private String jobPosition;
    private float salary;
    public Employee(Human human, String jobPosition, float salary) {
        this.human = human;
        this.jobPosition = jobPosition;
        this.salary = salary;
    }
    public Employee() {
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee tempEmployee = new Employee();
        tempEmployee.jobPosition = this.jobPosition;
        tempEmployee.salary = this.salary;
        tempEmployee.human = (Human) this.human.clone();
        return tempEmployee;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "human=" + human +
                ", jobPosition='" + jobPosition + '\'' +
                ", salary=" + salary +
                '}';
    }
}