package com.company.Pelnomocnik;

public class Pelnomocnik {

    public static void run() {

    Developer developer = new Developer();
    Manager manager = new Manager();

    ProxyEmploee proxyEmploeeDev1 = new ProxyEmploee(developer);
    ProxyEmploee proxyEmploeeMan2 = new ProxyEmploee(manager);

    proxyEmploeeDev1.generateTimeReport();
    proxyEmploeeMan2.generateTimeReport();

    }
}
