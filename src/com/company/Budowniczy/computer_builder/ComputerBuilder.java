package com.company.Budowniczy.computer_builder;

public abstract class ComputerBuilder {
    protected Ram ram;
    protected Hdd hdd;
    protected Processor processor;
    protected GraphicCard graphicCard;
    protected String keyboard;
    protected String ac;
    protected String cover;
    protected String screen;


    public ComputerBuilder setRamType(Ram ram){
        this.ram = ram;
        return this;
    }
    public ComputerBuilder setHddType(Hdd hdd){
        this.hdd = hdd;
        return this;
    }
    public ComputerBuilder setProcessorType(Processor processor){
        this.processor = processor;
        return this;
    }
    public ComputerBuilder setGraphicCardType(GraphicCard graphicCard){
        this.graphicCard = graphicCard;
        return this;
    }
    public ComputerBuilder setKeyboard(String keyboard){
        this.keyboard = keyboard;
        return this;
    }

    public abstract Computer build();

}
