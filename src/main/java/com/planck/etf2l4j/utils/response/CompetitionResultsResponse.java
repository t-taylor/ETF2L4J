package com.planck.etf2l4j.utils.response;

import com.google.gson.annotations.SerializedName;
import com.planck.etf2l4j.utils.competition.Result;
import com.planck.etf2l4j.utils.recruitment.PageInfo;

import java.util.List;

public class CompetitionResultsResponse {
    private Status status;
    private List<Result> results;
    @SerializedName("page")
    private PageInfo pageInfo;

    /**
     * @return Call status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @return List of competition results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * @return details about page
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
}
