package com.company.Dekorator;

public class OnionPizza extends IngredientsBuilder {

    public OnionPizza(Pizza pizza){
        super(pizza);
    }

    @Override
    public void makePizza(){
        super.makePizza();
        System.out.println("Dodano cebulę do pizzy bazowej");
    }

}
