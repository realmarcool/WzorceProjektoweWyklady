package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class WearOSWatch implements SmartWatch {
    @Override
    public void build() {
        System.out.println("SmartWatch Google - WearOS");
    }
}
