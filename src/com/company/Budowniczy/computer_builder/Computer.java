package com.company.Budowniczy.computer_builder;

public class Computer {
    private ComputerType computerType;
    private Ram ram;
    private Hdd hdd;
    private Processor processor;
    private GraphicCard graphicCard;
    private String keyboard;
    private String ac;
    private String cover;
    private String screen;

    public Computer(ComputerType computerType, Ram ram, Hdd hdd, Processor processor, GraphicCard graphicCard,
                    String keyboard, String ac, String cover, String screen){
        this.computerType = computerType;
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
        this.graphicCard = graphicCard;
        this.keyboard = keyboard;
        this.ac = ac;
        this.cover = cover;
        this.screen = screen;
    }


    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return
                computerType +
                ", \nram=" + ram +
                ", \nhdd=" + hdd +
                ", \nprocessor=" + processor +
                ", \ngraphicCard=" + graphicCard +
                ", \nac='" + ac + '\'' +
                ", \ncover='" + cover + '\'' +
                ", \nmonitor='" + screen + '\'' +
                ", \nkeyboard='" + keyboard + '\'';
    }
}
