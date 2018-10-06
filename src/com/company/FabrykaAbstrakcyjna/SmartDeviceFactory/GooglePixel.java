package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class GooglePixel implements SmartPhone {
    @Override
    public void build() {
        System.out.println("Smartphone Google - Google Pixel");
    }
}
