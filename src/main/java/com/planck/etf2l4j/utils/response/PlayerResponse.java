package com.planck.etf2l4j.utils.response;

import com.planck.etf2l4j.utils.player.Player;

public class PlayerResponse {

    public PlayerResponse(Player player, Status status) {

        this.player = player;
        this.status = status;

    }

    private Player player;
    private Status status;

    public Player getPlayer() {
        return player;
    }

    public Status getStatus() {
        return status;
    }
}
