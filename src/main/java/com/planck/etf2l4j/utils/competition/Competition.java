package com.planck.etf2l4j.utils.competition;


import com.planck.etf2l4j.ETF2L4J;
import com.planck.etf2l4j.utils.response.CompetitionMatchesResponse;
import com.planck.etf2l4j.utils.response.CompetitionResultsResponse;
import retrofit2.Call;

import java.util.List;

public class Competition {

    private String category;
    private String description;
    private int id;
    private String name;
    private List<String> pool;
    private TeamInfo teams;
    private String type;
    private URLs urls;

    /**
     * @return Competition category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @return Competition description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return ETF2L competition id
     */
    public int getId() {
        return id;
    }

    /**
     * @return Competition name
     */
    public String getName() {
        return name;
    }

    /**
     * @return A list of the map pool
     */
    public List<String> getPool() {
        return pool;
    }

    /**
     * @return game format
     */
    public String getType() {
        return type;
    }

    // TODO: get match call with urls

    /**
     * @param e ETF2L4J object
     * @return A call to the matches list
     */
    public Call<CompetitionMatchesResponse> getMatches(ETF2L4J e) {
        return e.getCompetitionMatches(Integer.toString(id));
    }

    /**
     * @param e ETF2L4J object
     * @return A call to the matches list
     */
    public Call<CompetitionResultsResponse> getResults(ETF2L4J e) {
        return e.getCompetitionResults(Integer.toString(id));
    }

    private class URLs {
        private String matches;
        private String results;
        private String self;
        private String teams;
    }

    /**
     * @return max number of signups
     */
    public int getMaxTeams() {
        return teams.max;
    }

    /**
     * @return current number of signups
     */
    public int getSignedTeams() {
        return teams.signedup;
    }

    private class TeamInfo {
        private int max;
        private int signedup;
    }

}
