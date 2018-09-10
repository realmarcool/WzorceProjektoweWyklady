package com.company.Obserwator;

public class Obserwator {
    public static void run(){
        Shop shop = new MediaMarkt();
        Subscriber subscriber1 = new MediaMarktClient("klient 1");
        Subscriber subscriber2 = new MediaMarktClient("klient 2");
        shop.addSubscribe(subscriber1);
        shop.addSubscribe(subscriber2);
        shop.notifyAboutNewsLetter(new NewsLetter("gazetka1", "brak opisu"));
        shop.removeSubsriber(subscriber1);
        shop.notifyAboutNewsLetter(new NewsLetter("gazetka2", "brak opisu"));
    }
}
