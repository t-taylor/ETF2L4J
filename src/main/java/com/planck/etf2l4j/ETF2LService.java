package com.planck.etf2l4j;

import com.planck.etf2l4j.utils.response.PlayerResponse;
import com.planck.etf2l4j.utils.response.TeamResponse;
import com.planck.etf2l4j.utils.team.Competition;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ETF2LService {

    @GET("player/{id}.json")
    Call<PlayerResponse> getPlayer(@Path("id") String id);

    @GET("team/{id}.json")
    Call<TeamResponse> getTeam(@Path("id") String id);

    @GET("competition/{id}.json")
    Call<Competition> getCompetition(@Path("id") String id);
}
