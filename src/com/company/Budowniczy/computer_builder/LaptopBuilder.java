package com.company.Budowniczy.computer_builder;

public class LaptopBuilder extends ComputerBuilder {
    @Override
    public Computer build() {
        return new Computer(ComputerType.LAPTOP, ram, hdd, processor, graphicCard, "embedded", "wbudowany",
                "Obudowa laptopowa", "Ekran wbudowany");
    }
}
