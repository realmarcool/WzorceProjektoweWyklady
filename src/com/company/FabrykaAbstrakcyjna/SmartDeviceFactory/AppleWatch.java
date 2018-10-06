package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class AppleWatch implements SmartWatch {
    @Override
    public void build() {
        System.out.println("Apple smartwatch - Apple Watch");
    }
}
