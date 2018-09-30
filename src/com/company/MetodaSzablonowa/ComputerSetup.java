package com.company.MetodaSzablonowa;

public abstract class ComputerSetup {
    public final void computerBuild() {
        System.out.print("Płyta Główna: ");
        AddMotherboard();
        System.out.print("Procesor: ");
        AddProcessor();
        System.out.print("Ram: ");
        AddRam();
        System.out.print("Karta graficzna: ");
        AddGraphicCard();
        System.out.print("Hdd: ");
        AddHdd();
        System.out.print("Software: ");
        AddSoftware();
    }
    public abstract void AddMotherboard();
    public abstract void AddProcessor();
    public abstract void AddRam();
    public abstract void AddGraphicCard();
    public abstract void AddHdd();
    public abstract void AddSoftware();
}