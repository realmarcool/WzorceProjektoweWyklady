package com.company;

import com.company.Budowniczy.computer_builder.BuilderRunable;
import com.company.Dekorator.Dekorator;
import com.company.Iterator.IteratorRun;
import com.company.Kompozyt.Kompozyt;
import com.company.LancuchZoobowiazan.LancuchZoobowiazan;
import com.company.Mediator.Mediator;
import com.company.MetodaSzablonowa.TemplateMethod;
import com.company.MetodaWytworcza.MetodaWytworcza;
import com.company.Most.Most;
import com.company.Obserwator.Obserwator;
import com.company.Pelnomocnik.Pelnomocnik;
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
        System.out.println("\nWzorzec Mediator");
        Mediator.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Iterator");
        IteratorRun.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Budowniczy");
        BuilderRunable.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Metoda Szablonowa");
        TemplateMethod.run();
        System.out.println("------------------------------------------------");
        System.out.println("\nWzorzec Pełnomocnik");
        Pelnomocnik.run();
        System.out.println("------------------------------------------------");




        // write your code here
    }
}
