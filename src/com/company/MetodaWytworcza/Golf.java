package com.company.MetodaWytworcza;

public class Golf extends Car {

    public Golf() {
        super(CarName.GOLF);
    }

    @Override
    public String getDescription() {
        return "Jestem Golfem";
    }
}
