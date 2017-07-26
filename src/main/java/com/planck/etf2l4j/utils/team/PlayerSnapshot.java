package com.planck.etf2l4j.utils.team;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.planck.etf2l4j.utils.player.SteamInfo;

public class PlayerSnapshot {

    @Expose
    private String country;
    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private SteamInfo steam;
    @Expose
    private String url;

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SteamInfo getSteam() {
        return steam;
    }

    public String getUrl() {
        return url;
    }

}
