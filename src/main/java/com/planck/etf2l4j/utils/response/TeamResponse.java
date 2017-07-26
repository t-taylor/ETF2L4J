package com.planck.etf2l4j.utils.response;

import com.google.gson.annotations.Expose;
import com.planck.etf2l4j.utils.team.Team;

public class TeamResponse {

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
