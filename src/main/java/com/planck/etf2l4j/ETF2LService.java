package com.planck.etf2l4j;

import com.planck.etf2l4j.utils.response.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ETF2LService {

    @GET("player/{id}.json")
    Call<PlayerResponse> getPlayer(@Path("id") String id);

    @GET("team/{id}.json")
    Call<TeamResponse> getTeam(@Path("id") String id);

    @GET("recruitment/players/{page}.json")
    Call<PlayerRecruitmentResponse> getPlayerRecruitment(@Path("page") int page);

    @GET("competition/{id}.json")
    Call<CompetitionResponse> getCompetition(@Path("id") String id);

    @GET("competition/{id}/matches/{page}.json")
    Call<CompetitionMatchesResponse> getCompetitionMatches(@Path("id") String id, @Path("page") int page);

    @GET("competition/{id}/results/{page}.json")
    Call<CompetitionResultsResponse> getCompetitionResults(@Path("id") String id, @Path("page") int page);
}
