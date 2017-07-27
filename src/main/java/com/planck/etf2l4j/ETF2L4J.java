package com.planck.etf2l4j;

import com.planck.etf2l4j.utils.response.*;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ETF2L4J implements ETF2LService {

    private static final String URL = "https://api.etf2l.org/";
    private Retrofit build;
    private ETF2LService service;

    /**
     * EFT2L API wrapper constructor
     */
    public ETF2L4J() {
        build = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = build.create(ETF2LService.class);
    }

    /**
     * Gives a call to basic player credentials from an id
     * @param id Can be either the player's ETF2L id, a SteamID or a SteamID64
     * @return A call to basic player credentials
     */
    @Override
    public Call<PlayerResponse> getPlayer(String id) {
        return service.getPlayer(id);
    }

    /**
     * Gives a call to basic team details from an id
     * @param id Team ETF2L id
     * @return A call to Basic team details
     */
    @Override
    public Call<TeamResponse> getTeam(String id) {
        return service.getTeam(id);
    }

    /**
     * Gives a call to a page of player recruitment posts
     * @param page Page number
     * @return A call to player recruitment posts
     */
    @Override
    public Call<PlayerRecruitmentResponse> getPlayerRecruitment(int page) {
        return service.getPlayerRecruitment(page);
    }

    /**
     * Gives a call to competition details from its respective id
     * @param id Competition id
     * @return A call to competition details
     */
    @Override
    public Call<CompetitionResponse> getCompetition(String id) {
        return service.getCompetition(id);
    }

    /**
     * Gives a call to the matches the specified competition
     * @warning Currently doesn't work as the api returns null with a successful error code
     * @param id Competition id
     * @return List of matches
     */
    @Override
    public Call<CompetitionMatchesResponse> getCompetitionMatches(String id) {
        return service.getCompetitionMatches(id);
    }

    /**
     * Gives a call to the results of the specified competition
     * @warning Currently doesn't work as the api returns null with a successful error code
     * @param id Competition id
     * @return List of results
     */
    @Override
    public Call<CompetitionResultsResponse> getCompetitionResults(String id) {
        return service.getCompetitionResults(id);
    }

}
