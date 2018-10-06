package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class IPhone implements SmartPhone {
    @Override
    public void build() {
        System.out.println("Apple phone - IPhone");
    }
}
