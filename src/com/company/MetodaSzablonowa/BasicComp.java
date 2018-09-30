package com.company.MetodaSzablonowa;

public class BasicComp extends ComputerSetup {
    @Override
    public void AddMotherboard() {
        System.out.println("Syfiasty motherboard");
    }

    @Override
    public void AddProcessor() {
        System.out.println("Syfiasy processor");
    }

    @Override
    public void AddRam() {
        System.out.println("Mało ramu");
    }

    @Override
    public void AddGraphicCard() {
        System.out.println("Karta graficzna wbudowana w motherboard");

    }

    @Override
    public void AddHdd() {
        System.out.println("300GB, 5400rpm");

    }

    @Override
    public void AddSoftware() {
        System.out.println("Office + Pasjans");

    }
}
