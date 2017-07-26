package com.planck.etf2l4j.utils.recruitment;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.player.SteamInfo;

import java.util.ArrayList;
import java.util.List;

public class PlayerRecruitmentPost {

    public PlayerRecruitmentPost() {
        classes = new ArrayList<>();
    }

    private List<String> classes;
    private Comments comments;
    private int id;
    private String name;
    private String skill;
    private SteamInfo steamInfo;
    private String type;
    private Urls ulrs;

    public List<String> getClasses() {
        return classes;
    }

    public Comments getComments() {
        return comments;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public SteamInfo getSteamInfo() {
        return steamInfo;
    }

    public String getType() {
        return type;
    }

    public String getPlayerUrl() {
        return ulrs.player;
    }

    public String getPostUrl() {
        return ulrs.post;
    }

    private class Urls {
        private String player;
        @SerializedName("recruitment")
        private String post;
    }
}
