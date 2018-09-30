package com.company.Budowniczy.computer_builder;

public class BuilderRunable {

    public static void run(){

        Computer desktop = new DesktopBuilder()
                .setKeyboard("Klawiatura razor")
                .setGraphicCardType(GraphicCard.GTX1050)
                .setHddType(Hdd.GB500)
                .setProcessorType(Processor.I5)
                .setRamType(Ram.GB16)
                .build();


        Computer laptop = new LaptopBuilder()
                .setGraphicCardType(GraphicCard.GTX1050)
                .setHddType(Hdd.GB1000)
                .setProcessorType(Processor.I7)
                .setRamType(Ram.GB4)
                .build();


        System.out.println("Komputer typu: " + desktop);
        System.out.println("\nKomputer typu: " + laptop);
    }
}
