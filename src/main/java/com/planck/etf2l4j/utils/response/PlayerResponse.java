package com.planck.etf2l4j.utils.response;

import com.planck.etf2l4j.utils.player.Player;

public class PlayerResponse {

    private Player player;
    private Status status;

    /**
     * Returns player details
     * @return Player object
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns API call status
     * @return Call status
     */
    public Status getStatus() {
        return status;
    }
}
