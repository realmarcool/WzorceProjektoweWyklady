package com.company.Obserwator;

public interface Shop {

    void addSubscribe(Subscriber subscriber);
    void removeSubsriber(Subscriber subscriber);
    void notifyAboutNewsLetter(NewsLetter newsLetter);
}
