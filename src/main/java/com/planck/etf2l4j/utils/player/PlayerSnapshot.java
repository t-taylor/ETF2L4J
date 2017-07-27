package com.planck.etf2l4j.utils.player;

import com.planck.etf2l4j.utils.player.SteamInfo;

public class PlayerSnapshot {

    private String country;
    private int id;
    private String name;
    private SteamInfo steam;
    private String url;

    /**
     * @return player's country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return player's id
     */
    public int getId() {
        return id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Steam info
     */
    public SteamInfo getSteam() {
        return steam;
    }

    /**
     * @return api url
     */
    public String getUrl() {
        return url;
    }

}
