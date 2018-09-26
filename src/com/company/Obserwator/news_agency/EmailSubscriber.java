package com.company.Obserwator.news_agency;

public class EmailSubscriber implements Subscriber {

    private String name;

    public EmailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutLatestNews(String agencyName, News news) {
        System.out.println(String.format(
                "%s received news from %s: %s by email",
                name, agencyName, news));
    }
}
