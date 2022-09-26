package com.canercelik.mancala.business;

import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.game.GameStartEntity;
import com.canercelik.mancala.service.impl.GameServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameBusiness {

    @Autowired
    public GameServiceImpl service;

    public GameStartEntity newGame(){
        return new GameStartEntity();
    }

    public GamePlayEntity newGamePlay() {
        return new GamePlayEntity();
    }
    public GameEntity start(@NotNull GameStartEntity playerNames) {
        return service
                .start(playerNames.getFirstPlayer(),
                        playerNames.getSecondPlayer());
    }

    public GameEntity play(GamePlayEntity gamePlayEntity){
        return service
                .play(gamePlayEntity);
    }

}
