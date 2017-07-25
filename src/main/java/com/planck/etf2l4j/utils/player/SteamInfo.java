package com.planck.etf2l4j.utils.player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class SteamInfo {

    public static SteamInfo parseJson(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, SteamInfo.class);
    }

    @Expose
    private String avatar;
    @Expose
    private String id;
    @Expose
    private String id3;
    @Expose
    private String id64;

    public String getAvatar() {
        return avatar;
    }

    public String getId() {
        return id;
    }

    public String getId3() {
        return id3;
    }

    public String getId64() {
        return id64;
    }
}
