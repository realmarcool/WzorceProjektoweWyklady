package com.company.Mediator;

public class TaxiDriver extends Driver {

    public TaxiDriver(Dispatcher dispatcher, String name) {
        super(dispatcher);
        this.name = name;
        driverStatus = DriverStatus.WAITING_FOR_ORDER;
    }
    public TaxiDriver(Dispatcher dispatcher, String name, DriverStatus driverStatus) {
        super(dispatcher);
        this.name = name;
        this.driverStatus = driverStatus;
    }



    @Override
    public void startOrder(String order) {
        driverStatus = DriverStatus.DURING_ORDER;
        System.out.println(name + " zaczyna zamówienie: " + order);

    }

    @Override
    public void stopOrder() {
        driverStatus = DriverStatus.WAITING_FOR_ORDER;
        dispatcher.updateDriverStatus(this);
    }
}
