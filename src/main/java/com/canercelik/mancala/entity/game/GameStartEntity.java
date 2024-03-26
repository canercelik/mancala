package com.canercelik.mancala.entity.game;

import lombok.Data;

/**
 * GameStartEntity is a data class that represents the initial state of a game.
 * It includes information about the names of the first and second players.
 */
@Data
public class GameStartEntity {

    /**
     * The name of the first player.
     */
    private String firstPlayer;

    /**
     * The name of the second player.
     */
    private String secondPlayer;
}