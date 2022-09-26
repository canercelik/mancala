package com.canercelik.mancala.service;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.enums.PlayerTurn;

public interface PlayerService {
    PlayerEntity create(String playerName, PlayerTurn playerType);


}