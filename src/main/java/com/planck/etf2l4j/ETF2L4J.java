package com.planck.etf2l4j;

import com.planck.etf2l4j.utils.recruitment.PlayerRecruitmentResponse;
import com.planck.etf2l4j.utils.response.PlayerResponse;
import com.planck.etf2l4j.utils.response.TeamResponse;
import com.planck.etf2l4j.utils.team.Competition;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ETF2L4J {

    private static final String URL = "https://api.etf2l.org/";
    private Retrofit build;
    private ETF2LService service;

    public ETF2L4J() {
        build = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = build.create(ETF2LService.class);
    }

    public Call<PlayerResponse> getPlayer(String id) {
        return service.getPlayer(id);
    }

    public Call<TeamResponse> getTeam(String id) {
        return service.getTeam(id);
    }

    public Call<Competition> getCompetition(String id) {
        return service.getCompetition(id);
    }

    public Call<PlayerRecruitmentResponse> getPlayerRecruitmentPost(int page) {
        return service.getPlayerRecuitment(page);
    }

}
