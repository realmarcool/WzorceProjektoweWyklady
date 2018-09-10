package com.company.MetodaWytworcza;

public class MetodaWytworcza {

    public static void run(){
        CarFactory carFactory = new VWcarFactory();
        Car car = carFactory.produceCar(CarName.A4);
        System.out.println(car.getDescription());

    }
}
