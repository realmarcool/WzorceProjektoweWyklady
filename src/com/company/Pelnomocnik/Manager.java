package com.company.Pelnomocnik;

public class Manager implements Emploee {


    @Override
    public void generateTimeReport() {
        System.out.println("Generuję raport");

    }

    @Override
    public String toString() {
        return "Manager";
    }

    @Override
    public boolean hasPermission() {
        return true;

    }
}
