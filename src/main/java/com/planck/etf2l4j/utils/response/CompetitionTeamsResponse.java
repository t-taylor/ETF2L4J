package com.planck.etf2l4j.utils.response;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.recruitment.PageInfo;
import com.planck.etf2l4j.utils.team.TeamSnapshot;

import java.util.List;

public class CompetitionTeamsResponse {
    private Status status;
    private List<TeamSnapshot> teams;
    @SerializedName("page")
    private PageInfo pageInfo;

    /**
     * @return Call status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @return List of team snapshots
     */
    public List<TeamSnapshot> getTeams() {
        return teams;
    }

    /**
     * @return Page details
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
}
