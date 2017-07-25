package com.planck.etf2l4j.utils;

public class SteamInfo {

    private String avatar;
    private String id;
    private String id3;
    private String id64;

    public SteamInfo(String avatar, String id, String id3, String id64){

        this.avatar = avatar;
        this.id = id;
        this.id3 = id3;
        this.id64 = id64;

    }

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
