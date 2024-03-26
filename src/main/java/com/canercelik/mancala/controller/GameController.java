package com.canercelik.mancala.controller;

import com.canercelik.mancala.business.GameBusiness;
import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.game.GameStartEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * GameController is a controller class that handles HTTP requests related to the game.
 * It uses the GameBusiness to interact with the game logic.
 */
@Controller
public class GameController {
    /**
     * The GameBusiness is used to interact with the game logic.
     */
    @Autowired
    public GameBusiness business;

    /**
     * Handles a GET request to the root ("/") URL.
     * Adds a new GameStartEntity to the model and returns the name of the "index" view.
     *
     * @param theModel The model to which to add the GameStartEntity.
     * @return The name of the "index" view.
     */
    @GetMapping("/")
    public String homeRequest(Model theModel) {
        theModel.addAttribute("playerNames", new GameStartEntity());
        return "index";
    }

    /**
     * Handles a POST request to the "/play" URL.
     * Starts a new game with the given player names, adds the new game and a new GamePlayEntity to the model,
     * and returns the name of the "play" view.
     *
     * @param playerNames A GameStartEntity containing the names of the players.
     * @param theModel The model to which to add the new game and the GamePlayEntity.
     * @return The name of the "play" view.
     */
    @PostMapping("/play")
    @ResponseStatus(HttpStatus.CREATED)
    public String newGame(@ModelAttribute GameStartEntity playerNames, Model theModel) {
        theModel.addAttribute("gameEntity", business.start(playerNames));
        theModel.addAttribute("gamePlayEntity", new GamePlayEntity());
        return "play";
    }

    /**
     * Handles a PUT request to the "/play" URL.
     * Plays a turn in the game based on the given GamePlayEntity and returns the updated game.
     *
     * @param gamePlayEntity A GamePlayEntity representing the state of the game and the current turn.
     * @return A GameEntity representing the state of the game after the turn has been played.
     */
    @PutMapping("/play")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public GameEntity gamePlay(@RequestBody GamePlayEntity gamePlayEntity) {
        return business.play(gamePlayEntity);
    }
}