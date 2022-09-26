package com.canercelik.mancala.service;

import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;

import java.util.UUID;

public interface GameService {
    GameEntity start(String firstPlayer, String secondPlayer);
    GameEntity play(GamePlayEntity gamePlayEntity);
    GameEntity getGameById(UUID uuid);
    void delete(UUID uuid);
}
