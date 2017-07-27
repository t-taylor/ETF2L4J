package com.planck.etf2l4j.utils.team;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.competition.Competition;
import com.planck.etf2l4j.utils.player.PlayerSnapshot;

import java.util.ArrayList;
import java.util.List;

public class Team {

    public Team() {
        // competitions = new ArrayList<>();
        players = new ArrayList<>();
    }

    // @Expose
    // private List<Competition> competitions;
    private String country;
    private String homepage;
    private int id;
    private IrcData irc;
    private String name;
    @SerializedName("players")
    private List<PlayerSnapshot> players;

    /**
     * @return List of competitions
     */
    public List<Competition> getCompetitions() {
        return null;
        // return competitions;
    }

    /**
     * @return Country string
     */
    public String getCountry() {
        return country;
    }

    /**
     * @return Team homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * @return ETF2L id
     */
    public int getId() {
        return id;
    }

    /**
     * @return Team name
     */
    public String getName() {
        return name;
    }

    /**
     * To get a player from a team you need to get the id and then get another call to the ETF2L4J object and ask for
     * the appropriate players details
     * @return List of players
     */
    public List<PlayerSnapshot> getPlayers() {
        return players;
    }

    /**
     * @return IRC channel
     */
    public String getIRCChannel() {
        return irc.channel;
    }

    /**
     * @return IRC network
     */
    public String getIRCNetwork() {
        return irc.network;
    }

    private class IrcData {
        public String channel;
        public String network;
    }
}
