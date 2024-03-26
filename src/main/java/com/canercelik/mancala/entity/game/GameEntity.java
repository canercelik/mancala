package com.canercelik.mancala.entity.game;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PlayerTurn;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

/**
 * GameEntity is a data class that represents the state of a game.
 * It includes information about the game's UUID, the players, the board, the game status, the total turn, and the player turn.
 */
@Data
@Builder
public class GameEntity {

    /**
     * The UUID of the game.
     */
    private UUID uuid;

    /**
     * The entity representing the first player.
     */
    private PlayerEntity firstPlayerEntity;

    /**
     * The entity representing the second player.
     */
    private PlayerEntity secondPlayerEntity;

    /**
     * The list of PitEntity objects representing the board of the game.
     */
    private List<PitEntity> board;

    /**
     * The status of the game, represented as a GameStatus enum.
     */
    private GameStatus status;

    /**
     * The total number of turns that have been played in the game.
     */
    private int totalTurn;

    /**
     * The turn of the player, represented as a PlayerTurn enum.
     */
    private PlayerTurn playerTurn;
}