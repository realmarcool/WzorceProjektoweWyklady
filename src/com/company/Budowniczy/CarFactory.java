package com.company.Budowniczy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarFactory {

    public static void main(String[] args) {
        Car ferrari = new FerrariCarBuilder()
                .setCarName("488 sport")
                .build();
        System.out.println("Ferrari: " + ferrari);

        Car porsche = new PorscheCarBuilder()
                .setCarType(CarType.SUV)
                .setCarName("XXX")
                .build();
        System.out.println("Porsche: " + porsche);
    }
}