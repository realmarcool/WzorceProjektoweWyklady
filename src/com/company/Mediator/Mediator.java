package com.company.Mediator;

public class Mediator {

    public static void run() {

        TaxiDispatcher taxiDispatcher = new TaxiDispatcher();
        TaxiDriver taxiDriver1 = new TaxiDriver(taxiDispatcher, "Janusz");
        TaxiDriver taxiDriver2 = new TaxiDriver(taxiDispatcher, "Andrzej",DriverStatus.DURING_ORDER);
        TaxiDriver taxiDriver3 = new TaxiDriver(taxiDispatcher, "Zbyszek");

        taxiDispatcher.addDriver(taxiDriver1);
        taxiDispatcher.addDriver(taxiDriver2);
        taxiDispatcher.addDriver(taxiDriver3);

        taxiDispatcher.takeOrder("Wały Chrobrego - Nowak");

    }





}
