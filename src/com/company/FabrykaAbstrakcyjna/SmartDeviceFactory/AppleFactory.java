package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class AppleFactory implements SmartDeviceFactory {
    @Override
    public SmartWatch createWatch() {
        return new AppleWatch();
    }

    @Override
    public SmartPhone createPhone() {
        return new IPhone();
    }
}
