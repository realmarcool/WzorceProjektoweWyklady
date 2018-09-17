package com.company.Mediator;

public interface Dispatcher {

    void takeOrder(String order);
    void sendOrder(String order);
    void updateDriverStatus(Driver driver);
    void addDriver(Driver driver);
}
