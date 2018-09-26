package com.company.MetodaWytworcza.chocolate;

public class MilkaFactoryProduction {
    public static void main(String[] args) {
        ChocolateFactory chocolateFactory = new MilkaFactory();
        Chocolate chocolate = chocolateFactory.produceChocolate(ChocolateType.MILK);
        System.out.println(String.format("opis: %s", chocolate.getDescription()));
        chocolate.showChocolate();
    }
}
