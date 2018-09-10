package com.company.Obserwator;

public class MediaMarktClient implements Subscriber {

    private String klient;

    public MediaMarktClient(String klient) {
        this.klient = klient;
    }

    @Override
    public String toString() {
        return  klient ;
    }

    @Override
    public void notifyAboutLatestNewsletter(NewsLetter newsLetter) {
        System.out.println(MediaMarktClient.this + " otrzymał newsletter:" + newsLetter);
    }
}
