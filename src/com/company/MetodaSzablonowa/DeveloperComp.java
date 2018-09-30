package com.company.MetodaSzablonowa;

public class DeveloperComp extends ComputerSetup {
    @Override
    public void AddMotherboard() {
        System.out.println("Motherboard dobrej marki");
    }

    @Override
    public void AddProcessor() {
        System.out.println("I7, 4Ghz");
    }

    @Override
    public void AddRam() {
        System.out.println("32GB ramu");
    }

    @Override
    public void AddGraphicCard() {
        System.out.println("Karta graficzna z wyjściem na trzy monitory");

    }

    @Override
    public void AddHdd() {
        System.out.println("2TB, SDD");

    }

    @Override
    public void AddSoftware() {
        System.out.println("IntelliJ IDEA");

    }
}