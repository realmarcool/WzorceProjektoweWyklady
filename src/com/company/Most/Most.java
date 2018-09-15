package com.company.Most;

import java.util.ArrayList;
import java.util.List;

public class Most {

    public static void run() {

        List<Media> mediaList = new ArrayList();
        mediaList.add(new Media("Film pierwszy"));
        mediaList.add(new Media("Film drugi"));

        PlayerAPI playerAPI = new MediaPlayer();
        HBOVOD hbovod = new HBOVOD(playerAPI,mediaList);

        hbovod.startPlaying(0);
        hbovod.stopPlaying(0);
        hbovod.nextMovie(1);
        hbovod.prevMovie(0);

    }
}
