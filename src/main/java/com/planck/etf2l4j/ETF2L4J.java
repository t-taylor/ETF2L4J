package com.planck.etf2l4j;

import com.planck.etf2l4j.utils.Competition;
import com.planck.etf2l4j.utils.Player;
import com.planck.etf2l4j.utils.Team;
import retrofit2.Call;
import retrofit2.Retrofit;

public class ETF2L4J {

    private static final String URL = "https://api.etf2l.org/";
    private Retrofit build;
    private ETF2LService service;

    public ETF2L4J() {
        build = new Retrofit.Builder().baseUrl(URL).build();
        service = build.create(ETF2LService.class);
    }

    public Call<Player> getPlayer(String id) {
        return service.getPlayer(id);
    }

    public Call<Team> getTeam(String id) {
        return service.getTeam(id);
    }

    public Call<Competition> getCompetition(String id) {
        return service.getCompetition(id);
    }

}
