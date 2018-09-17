package com.company.Mediator;

public abstract class Driver {
    protected DriverStatus driverStatus;
    protected Dispatcher dispatcher;
    protected String name;

    public Driver(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }

    public abstract void startOrder(String order);
    public abstract void stopOrder();


}
