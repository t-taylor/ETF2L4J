package com.planck.etf2l4j.test;

import com.planck.etf2l4j.ETF2L4J;
import com.planck.etf2l4j.utils.player.Player;
import com.planck.etf2l4j.utils.recruitment.PlayerRecruitmentPost;
import com.planck.etf2l4j.utils.response.CompetitionResponse;
import com.planck.etf2l4j.utils.response.PlayerRecruitmentResponse;
import com.planck.etf2l4j.utils.response.PlayerResponse;
import com.planck.etf2l4j.utils.response.TeamResponse;
import com.planck.etf2l4j.utils.competition.Competition;
import com.planck.etf2l4j.utils.player.PlayerSnapshot;
import com.planck.etf2l4j.utils.team.Team;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;

import java.util.List;

public class ETF2L4JTest {

    private ETF2L4J etf2L4J;

    @Before
    public void Creation() {
        etf2L4J = new ETF2L4J();
    }

    @Test
    public void PlayerTest() throws Exception {
        Call<PlayerResponse> playerCall = etf2L4J.getPlayer("115719");
        Player planck = playerCall.execute().body().getPlayer();

        assert planck != null;

        System.out.println("Player: " + planck.getName());

        StringBuilder teamString = new StringBuilder("[ ");
        for (Team t : planck.getTeams()) {
            teamString.append(t.getName()).append(" , ");
        }
        teamString = new StringBuilder(teamString.substring(0, teamString.length() - 2));
        System.out.println("Teams: " + teamString + "]");

        System.out.println("Country: " + planck.getCountry());
    }


    @Test
    public void TeamTest() throws Exception {

        Call<TeamResponse> teamCall = etf2L4J.getTeam("27874");
        Team gbk = teamCall.execute().body().getTeam();

        assert gbk != null;

        System.out.println("Team: " + gbk.getName());

        List<PlayerSnapshot> pss = gbk.getPlayers();

        // Fails occasionally because of bad API response
        assert pss != null;

        StringBuilder psString = new StringBuilder("[ ");
        for (PlayerSnapshot ps : pss) {
            psString.append(ps.getName()).append(" , ");
        }

        psString = new StringBuilder(psString.substring(0, psString.length() - 2) + "]");
        System.out.println("Players: " + psString);
    }

    @Test
    public void PlayerRecruitmentTest() throws Exception {
        Call<PlayerRecruitmentResponse> recCall = etf2L4J.getPlayerRecruitment(1);
        List<PlayerRecruitmentPost> recPosts = recCall.execute().body().getRecPost();

        assert recPosts != null;

        PlayerRecruitmentPost recPost = recPosts.get(0);

        System.out.println(recPost.getName());

        StringBuilder classes = new StringBuilder("[ ");
        for (String c : recPost.getClasses()) {
            classes.append(c).append(" , ");
        }
        System.out.println(classes.substring(0, classes.length() - 2) + "]" );

    }

    @Test
    public void CompetitionTest() throws Exception {

        Call<CompetitionResponse> compCall = etf2L4J.getCompetition("488");
        Competition comp = compCall.execute().body().getCompetition();

        assert comp != null;

        System.out.println(comp.getName());

        System.out.println(comp.getDescription());

        System.out.println(comp.getType());

    }

}
