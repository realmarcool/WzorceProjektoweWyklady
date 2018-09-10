package com.company.Dekorator;

public class Dekorator {

    public static void run() {
        Pizza pizza = new BasePizza();
        Pizza hamPizza = new HamPizza(pizza);
        Pizza onionPizza = new OnionPizza(pizza);
        Pizza hamOnionPizza = new HamPizza(new OnionPizza(pizza));

        System.out.println("------------Pizza bazowa--------------");
        pizza.makePizza();

        System.out.println("\n-----------Pizza z szynką-------------");
        hamPizza.makePizza();

        System.out.println("\n-----------Pizza z cebulą-------------");
        onionPizza.makePizza();

        System.out.println("\n-------Pizza z szynką i cebulą--------");
        hamOnionPizza.makePizza();
    }
}
