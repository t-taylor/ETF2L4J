package com.planck.etf2l4j.test;

import com.planck.etf2l4j.ETF2L4J;
import com.planck.etf2l4j.utils.response.PlayerResponse;
import com.planck.etf2l4j.utils.response.TeamResponse;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;

public class ETF2L4JTest {

    private ETF2L4J etf2L4J;

    @Before
    public void Creation() {
        etf2L4J = new ETF2L4J();
    }

    @Test
    public void PlayerTest() throws Exception {
        Call<PlayerResponse> playerCall = etf2L4J.getPlayer("115719");
        String name = playerCall.execute().body().getPlayer().getName();
        System.out.print("Player: " + name);
    }


    @Test
    public void TeamTest() throws Exception {
        Call<TeamResponse> teamCall = etf2L4J.getTeam("27874");
        String name = teamCall.execute().body().getTeam().getName();
        System.out.println("Team: " + name);
    }

}
