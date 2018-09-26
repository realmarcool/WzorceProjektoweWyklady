package com.company.Obserwator.news_agency;

import java.util.ArrayList;
import java.util.List;

public class PolishPressAgency implements NewsAgency {
    private String agencyName;
    private List<Subscriber> subscribers = new ArrayList<>();
    private List<News> newsList = new ArrayList<>();

    public PolishPressAgency() {
        agencyName = "PAP";
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void addNews(News news) {
        this.newsList.add(news);
        announceNews(news);
    }

    private void announceNews(News news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifyAboutLatestNews(agencyName, news);
        }
    }
}
