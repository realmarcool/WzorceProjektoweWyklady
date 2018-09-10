package com.company.Dekorator;

public class BasePizza implements Pizza {

    @Override
    public void makePizza() {
        System.out.println("Make base pizza");
    }
}
