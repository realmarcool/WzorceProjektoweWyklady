package com.company.FabrykaAbstrakcyjna.SmartDeviceFactory;

public class SmartDeviceFactoryMain {

        private final SmartDeviceFactory smartDeviceFactory;
        private final SmartPhone smartPhone;
        private final SmartWatch smartWatch;

        public SmartDeviceFactoryMain(SmartDeviceFactory smartDeviceFactory) {
            this.smartDeviceFactory = smartDeviceFactory;
            this.smartPhone = smartDeviceFactory.createPhone();
            this.smartWatch = smartDeviceFactory.createWatch();
        }

        public void showDevice() {
            smartPhone.build();
            smartWatch.build();
        }

        public static void main(String[] args) {
            SmartDeviceFactoryMain smartDeviceFactoryApple = new SmartDeviceFactoryMain(new AppleFactory());
            SmartDeviceFactoryMain smartDeviceFactoryGoogle = new SmartDeviceFactoryMain(new GoogleFactory());

            smartDeviceFactoryApple.showDevice();
            smartDeviceFactoryGoogle.showDevice();
        }
    }

