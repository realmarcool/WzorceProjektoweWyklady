package com.company;

import com.company.Dekorator.Dekorator;
import com.company.Kompozyt.Kompozyt;
import com.company.LancuchZoobowiazan.LancuchZoobowiazan;
import com.company.MetodaWytworcza.MetodaWytworcza;
import com.company.Most.Most;
import com.company.Obserwator.Obserwator;
import com.company.Prototyp.JobPlace;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("\nWzorzec Prototyp");
        JobPlace.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Dekorator");
        Dekorator.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Obserwator");
        Obserwator.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Metoda Wytwórcza");
        MetodaWytworcza.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Łańcuch Zoobowiązań");
        LancuchZoobowiazan.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Kompozyt");
        Kompozyt.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Most");
        Most.run();
        System.out.println("------------------------------------------------");



        // write your code here
    }
}
