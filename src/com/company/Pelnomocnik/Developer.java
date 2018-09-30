package com.company.Pelnomocnik;

public class Developer implements Emploee {


    @Override
    public void generateTimeReport() {
        System.out.println("Generuję raport");
    }

    @Override
    public String toString() {
        return "Developer";
    }

    @Override
    public boolean hasPermission() {
        return false;
    }
}
