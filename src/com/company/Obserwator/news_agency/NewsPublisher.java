package com.company.Obserwator.news_agency;

import java.time.LocalDate;
import java.time.Month;

public class NewsPublisher {

    public static void main(String[] args) {
        News news1 = new News("Python w Wiśle",
                "Znaleziono pytana w okolicach Torunia",
                LocalDate.of(2018, Month.SEPTEMBER, 6));

        News news2 = new News("Python w Wiśle",
                "Python ostani raz widziany był w Bydgoszczy",
                LocalDate.of(2018, Month.SEPTEMBER, 7));

        NewsAgency newsAgency = new PolishPressAgency();
        Subscriber emailSubscriber = new EmailSubscriber("email client");
        Subscriber pushNotificationSubscriber = new PushNotificationSubscriber("push notification client");
        newsAgency.addSubscriber(emailSubscriber);
        newsAgency.addSubscriber(pushNotificationSubscriber);
        newsAgency.addNews(news1);
        newsAgency.removeSubscriber(emailSubscriber);
        newsAgency.addNews(news2);
    }
}
