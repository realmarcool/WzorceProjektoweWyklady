package com.company.Most;

import java.util.List;

public class HBOVOD implements VOD {

    private List<Media> mediaList;
    private PlayerAPI playerAPI;

    public HBOVOD(PlayerAPI playerAPI, List<Media> mediaList) {
        this.playerAPI = playerAPI;
        this.mediaList = mediaList;
    }

    public void startPlaying(int track) {
        playerAPI.play(mediaList.get(track));
    }

    public void stopPlaying(int track) {
        playerAPI.stop(mediaList.get(track));
    }

    public void nextMovie(int track) {
        playerAPI.next(mediaList.get(track));
    }

    public void prevMovie(int track) {
        playerAPI.prev(mediaList.get(track));
    }




}
