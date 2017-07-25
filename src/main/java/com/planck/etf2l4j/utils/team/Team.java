package com.planck.etf2l4j.utils.team;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import java.util.List;

public class Team {

    public static Team parseJson(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, Team.class);
    }

    @Expose
    private List<Competition> competitions;
    @Expose
    private String country;
    @Expose
    private String homepage;
    @Expose
    private int id;
    @Expose
    private IrcData irc;
    @Expose
    private String name;
    @Expose
    private List<PlayerSnapshot> players;

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public String getCountry() {
        return country;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<PlayerSnapshot> getPlayers() {
        return players;
    }

    public String getIRCChannel() {
        return irc.channel;
    }

    public String getIRCNetwork() {
        return irc.network;
    }

    private class IrcData {
        public String channel;
        public String network;

        public IrcData parseJSON(String response) {
            Gson gson = new GsonBuilder().create();
            return gson.fromJson(response, IrcData.class);
        }
    }
}
