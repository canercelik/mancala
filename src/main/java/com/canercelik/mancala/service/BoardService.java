package com.canercelik.mancala.service;

import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.PlayerTurn;

import java.util.List;

public interface BoardService{
    List<PitEntity> create();
    List<PitEntity> newBoard();
    List<PitEntity> playerHouses(PlayerTurn playerTurn);
    int calculateOppositeId(int id, PlayerTurn playerTurn);
}
