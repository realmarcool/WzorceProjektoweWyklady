package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class GoogleFactory implements SmartDeviceFactory {
    @Override
    public SmartWatch createWatch() {
        return new WearOSWatch();
    }

    @Override
    public SmartPhone createPhone() {
        return new GooglePixel();
    }
}
