package com.company.Budowniczy.computer_builder;

public class DesktopBuilder extends ComputerBuilder {

    @Override
    public Computer build() {
        return new Computer(ComputerType.DESKTOP, ram, hdd, processor, graphicCard, keyboard, ac, cover, screen);
    }
}
