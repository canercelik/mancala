package com.canercelik.mancala.business;

import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.game.GameStartEntity;
import com.canercelik.mancala.service.impl.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * GameBusiness is a component class that handles the business logic for the game.
 * It uses the GameServiceImpl to interact with the game data.
 */
@Component
public class GameBusiness {

    /**
     * The GameServiceImpl is used to interact with the game data.
     */
    @Autowired
    private GameServiceImpl service;

    /**
     * Starts a new game with the given player names.
     *
     * @param playerNames A GameStartEntity containing the names of the players.
     * @return A GameEntity representing the state of the new game.
     */
    public GameEntity start(GameStartEntity playerNames) {
        return service.start(playerNames.getFirstPlayer(), playerNames.getSecondPlayer());
    }

    /**
     * Plays a turn in the game based on the given GamePlayEntity.
     *
     * @param gamePlayEntity A GamePlayEntity representing the state of the game and the current turn.
     * @return A GameEntity representing the state of the game after the turn has been played.
     */
    public GameEntity play(GamePlayEntity gamePlayEntity){
        return service.play(gamePlayEntity);
    }
}