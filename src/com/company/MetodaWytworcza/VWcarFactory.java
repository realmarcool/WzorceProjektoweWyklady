package com.company.MetodaWytworcza;

public class VWcarFactory implements CarFactory {
    @Override
    public Car produceCar(CarName carName) {
        Car car = null;

        switch (carName) {
            case FABIA:
                car = new Fabia();
                break;
            case GOLF:
                car = new Golf();
                break;
            case A4:
                car = new A4();
                break;
        }
        return car;
    }
}
