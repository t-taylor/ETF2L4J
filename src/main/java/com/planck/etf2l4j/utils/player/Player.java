package com.planck.etf2l4j.utils.player;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.team.Team;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String bans;
    private List<String> classes;
    private String country;
    private int id;
    private String name;
    private int registered;
    @SerializedName("steam")
    private SteamInfo steamInfo;
    private List<Team> teams;
    private String title;

    public Player(){
        teams = new ArrayList<>();
    }

    /**
     * @return Ban status
     */
    public String getBans() {
        return bans;
    }

    /**
     * @return List of classes played
     */
    public List<String> getClasses() {
        return classes;
    }

    /**
     * @return Country string
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return ETF2L name
     */
    public int getId() {
        return id;
    }

    /**
     * @return Players name
     */
    public String getName() {
        return name;
    }

    /**
     * tbh I don't have a clue what the hell this is but here, have it
     * @return Register number
     */
    public int getRegistered() {
        return registered;
    }

    /**
     * @return Steam details
     */
    public SteamInfo getSteamInfo() {
        return steamInfo;
    }

    /**
     * @return List of players teams
     */
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * @return Player's assigned title
     */
    public String getTitle() {
        return title;
    }
}
