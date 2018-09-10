package com.company.Dekorator;

public class HamPizza extends IngredientsBuilder {

    public HamPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public void makePizza(){
        super.makePizza();
        System.out.println("Dodano szynkę do pizzy bazowej");
    }

}