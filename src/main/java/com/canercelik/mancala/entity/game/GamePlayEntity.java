package com.canercelik.mancala.entity.game;

import com.canercelik.mancala.enums.PlayerTurn;
import lombok.Data;

import java.util.UUID;

/**
 * GamePlayEntity is a data class that represents the state of a game play.
 * It includes information about the game's UUID, the player's turn, and the pit index.
 */
@Data
public class GamePlayEntity {

    /**
     * The UUID of the game.
     */
    private UUID uuid;

    /**
     * The turn of the player, represented as a PlayerTurn enum.
     */
    private PlayerTurn playerTurn;

    /**
     * The index of the pit in the game.
     */
    private int pitIndex;
}