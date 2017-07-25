package com.planck.etf2l4j;

import com.planck.etf2l4j.utils.team.Competition;
import com.planck.etf2l4j.utils.player.Player;
import com.planck.etf2l4j.utils.team.Team;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ETF2LService {

    @GET("player/{id}.json")
    Call<Player> getPlayer(@Path("id") String id);

    @GET("team/{id}.json")
    Call<Team> getTeam(@Path("id") String id);

    @GET("competition/{id}.json")
    Call<Competition> getCompetition(@Path("id") String id);
}
