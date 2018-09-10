package com.company.Obserwator;

import java.util.ArrayList;
import java.util.List;

public class MediaMarkt implements Shop {

    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubsriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAboutNewsLetter(NewsLetter newsLetter) {
        for (Subscriber subscriber: subscribers){
            subscriber.notifyAboutLatestNewsletter(newsLetter);
        }
    }
}
