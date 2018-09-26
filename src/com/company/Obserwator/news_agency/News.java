package com.company.Obserwator.news_agency;

import java.time.LocalDate;
import java.util.Objects;

public class News {
    private String title;
    private String description;
    private LocalDate newsDate;

    public News(String title, String description, LocalDate newsDate) {
        this.title = title;
        this.description = description;
        this.newsDate = newsDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getNewsDate() {
        return newsDate;
    }

    public void setNewsDate(LocalDate newsDate) {
        this.newsDate = newsDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(title, news.title) &&
                Objects.equals(description, news.description) &&
                Objects.equals(newsDate, news.newsDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, description, newsDate);
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", newsDate=" + newsDate +
                '}';
    }
}
