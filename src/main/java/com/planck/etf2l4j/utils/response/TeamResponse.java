package com.planck.etf2l4j.utils.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.planck.etf2l4j.utils.team.Team;

public class TeamResponse {

    public static TeamResponse parseJson(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, TeamResponse.class);
    }

    @Expose
    private Team team;

    @Expose
    private Status status;

    public Team getTeam() {
        return team;
    }

    public Status getStatus() {
        return status;
    }
}
