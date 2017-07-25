package com.planck.etf2l4j.test;

import com.planck.etf2l4j.ETF2L4J;
import com.planck.etf2l4j.utils.player.Player;
import com.planck.etf2l4j.utils.response.PlayerResponse;
import com.planck.etf2l4j.utils.team.Team;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ETF2L4JTest {

    private ETF2L4J etf2L4J;

    @Before
    public void Creation() {
        etf2L4J = new ETF2L4J();
    }

    @Test
    public void PlayerTest() throws Exception {
        Call<PlayerResponse> playerCall = etf2L4J.getPlayer("115719");
        System.out.print("Player: " + playerCall.execute().body().getPlayer());
    }


    @Test
    public void TeamTest() throws Exception {
        Call<Team> teamCall = etf2L4J.getTeam("27874");
        System.out.println("Team: " + teamCall.execute().body().getName());
    }

}
