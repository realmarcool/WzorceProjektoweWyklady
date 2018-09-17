package com.company.Mediator;

import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Dispatcher {

    private List<Driver> drivers = new ArrayList<>();

    public TaxiDispatcher(){
        this.drivers = new ArrayList<>();
    }

    @Override
    public void takeOrder(String order) {
        System.out.println("Take order: " + order + " -> accept");
        sendOrder(order);
    }

    @Override
    public void sendOrder(String order) {
        for (Driver driver: drivers){
            System.out.println("Sprawdzam status: " + driver.name);
            if (driver.driverStatus == DriverStatus.WAITING_FOR_ORDER){
                driver.startOrder(order);
                System.out.println(driver.name + " jest wolny, wysyłam mu zamówienie: " + order);
                return;
            }
        }
    }

    @Override
    public void updateDriverStatus(Driver driver) {
        System.out.println("Update driver status: " + driver);
    }

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }
}
