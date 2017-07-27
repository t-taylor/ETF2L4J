package com.planck.etf2l4j.utils.response;

import com.planck.etf2l4j.utils.competition.Competition;

public class CompetitionResponse {

    private Status status;
    private Competition competition;

    /**
     * @return Call status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @return Competition details
     */
    public Competition getCompetition() {
        return competition;
    }
}
