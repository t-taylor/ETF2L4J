package com.planck.etf2l4j.utils.team;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.ETF2L4J;
import com.planck.etf2l4j.utils.player.SteamInfo;
import com.planck.etf2l4j.utils.response.TeamResponse;
import retrofit2.Call;

public class TeamSnapshot {
    private int id;
    private String name;
    @SerializedName("steam")
    private SteamInfo steamInfo;
    private String url;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public SteamInfo getSteamInfo() {
        return steamInfo;
    }

    public Call<TeamResponse> getTeam(ETF2L4J etf2L4J) {
        return etf2L4J.getTeam(url.substring(url.lastIndexOf("team/")));
    }
}
