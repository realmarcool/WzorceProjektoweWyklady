package com.company.Prototyp;

public class Human implements Cloneable{
    private String name;
    private String lastName;
    private int age;
    public Human(){ }
    public Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Human tempHuman = new Human();
        tempHuman.name = this.name;
        tempHuman.lastName = this.lastName;
        tempHuman.age = this.age;
        return tempHuman;
    }
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}