package com.planck.etf2l4j.utils.recruitment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.player.SteamInfo;

import java.util.ArrayList;
import java.util.List;

public class PlayerRecruitmentPost {

    public PlayerRecruitmentPost() {
        classes = new ArrayList<>();
    }

    @Expose
    private List<String> classes;
    @Expose
    private Comments comments;
    @Expose
    private int id;
    @Expose
    private String name;
    @Expose
    private String skill;
    @Expose
    private SteamInfo steamInfo;
    @Expose
    private String type;
    @Expose
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
        @Expose
        private String player;
        @Expose
        @SerializedName("recruitment")
        private String post;
    }
}
