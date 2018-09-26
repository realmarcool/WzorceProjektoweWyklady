package com.company.Obserwator.news_agency;


public class PushNotificationSubscriber implements Subscriber {

    private String name;

    public PushNotificationSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutLatestNews(String agencyName, News news) {
        System.out.println(String.format(
                "%s received news from %s: %s by push notification",
                name, agencyName, news));
    }
}
