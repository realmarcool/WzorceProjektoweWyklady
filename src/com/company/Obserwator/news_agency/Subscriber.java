package com.company.Obserwator.news_agency;

public interface Subscriber {

    void notifyAboutLatestNews(String agencyName, News news);
}
