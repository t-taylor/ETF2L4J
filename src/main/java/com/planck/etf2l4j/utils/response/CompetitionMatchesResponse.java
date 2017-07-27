package com.planck.etf2l4j.utils.response;

import com.planck.etf2l4j.utils.competition.Match;

import java.util.List;

public class CompetitionMatchesResponse {

    private Status status;
    private List<Match> matches;

    /**
     * @return Call status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @return Match list
     */
    public List<Match> getMatches() {
        return matches;
    }

}
