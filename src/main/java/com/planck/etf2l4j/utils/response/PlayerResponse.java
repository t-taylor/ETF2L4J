package com.planck.etf2l4j.utils.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.planck.etf2l4j.utils.player.Player;

public class PlayerResponse {

    public static PlayerResponse parseJson(String response) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(response, PlayerResponse.class);
    }

    public PlayerResponse(Player player, Status status) {

        this.player = player;
        this.status = status;

    }

    private Player player;
    private Status status;

    // TODO: parse

    public Player getPlayer() {
        return player;
    }

    public Status getStatus() {
        return status;
    }
}
