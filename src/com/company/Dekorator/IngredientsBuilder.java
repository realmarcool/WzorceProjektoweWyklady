package com.company.Dekorator;

public abstract class IngredientsBuilder implements Pizza {

    private Pizza pizza;
    public IngredientsBuilder(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void makePizza() {
        pizza.makePizza();
    }
}

