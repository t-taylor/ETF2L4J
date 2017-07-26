package com.planck.etf2l4j.utils.player;

import com.google.gson.annotations.Expose;

public class SteamInfo {

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
