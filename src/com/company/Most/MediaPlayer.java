package com.company.Most;

public class MediaPlayer implements PlayerAPI {
    @Override
    public void play(Media movie) {
        System.out.println("MediaPlayer rozpoczął odtwarzanie filmu " + movie);
    }

    @Override
    public void stop(Media movie) {
        System.out.println("MediaPlayer przerwał odtwarzanie filmu " + movie);
    }

    @Override
    public void next(Media movie) {
        System.out.println("MediaPlayer przeskoczył do następnego filmu " + movie);
    }

    @Override
    public void prev(Media movie) {
        System.out.println("MediaPlayer wrócił do poprzedniego filmu " + movie);
    }
}
