package com.planck.etf2l4j.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Player {

    @Expose
    private String bans;

    @Expose
    private List<String> classes;

    @Expose
    private String country;

    @Expose
    private int id;

    @Expose
    private String name;

    @Expose
    private int registered;

    @Expose
    @SerializedName("steam")
    private SteamInfo steamInfo;

    @Expose
    private List<Team> teams;

    @Expose
    private String title;

    public Player(){
        teams = new ArrayList<>();
    }

    public static Player parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, Player.class);
    }

    public String getBans() {
        return bans;
    }

    public List<String> getClasses() {
        return classes;
    }

    public String getCountry() {
        return country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRegistered() {
        return registered;
    }

    public SteamInfo getSteamInfo() {
        return steamInfo;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public String getTitle() {
        return title;
    }
}
