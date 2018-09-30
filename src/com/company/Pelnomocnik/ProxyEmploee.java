package com.company.Pelnomocnik;

public class ProxyEmploee implements Emploee {

    private Emploee emploee;

    @Override
    public void generateTimeReport() {

        if (emploee.hasPermission()) {
            System.out.print("Pracownik " + emploee + " - ");
            emploee.generateTimeReport();
        }else {
            System.out.println("Pracownik " + emploee + " - Brak uprawnień!");
        }
    }

    @Override
    public boolean hasPermission() {
        return emploee.hasPermission();
        }


    public ProxyEmploee(Emploee emploee){
        this.emploee = emploee;

    }
}
