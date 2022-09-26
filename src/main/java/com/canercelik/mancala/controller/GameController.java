package com.canercelik.mancala.controller;

import com.canercelik.mancala.business.GameBusiness;
import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.game.GameStartEntity;
import io.swagger.v3.oas.annotations.Operation;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GameController {
    @Autowired
    public GameBusiness business;

    @GetMapping("/")
    public String homeRequest(@NotNull Model theModel) {
        theModel.addAttribute("playerNames", business.newGame());
        return "index";
    }

    @PostMapping("/play")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "New Game Start Request", description = "This method handles the first request from client with player names")
    public String newGame(@ModelAttribute GameStartEntity playerNames, @NotNull Model theModel) {
        theModel.addAttribute("gameEntity", business.start(playerNames) );
        theModel.addAttribute("gamePlayEntity", business.newGamePlay());
        return "play";
    }

    @PutMapping("/play")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @Operation(summary = "Game Play Request", description = "This method handles the play calls")
    public GameEntity gamePlay(@RequestBody @NotNull GamePlayEntity gamePlayEntity) {
        return business.play(gamePlayEntity);
    }

    @GetMapping("/error")
    public String errorMapper() {
        return "error";
    }

}
