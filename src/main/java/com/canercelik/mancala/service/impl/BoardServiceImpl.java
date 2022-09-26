package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.service.BoardService;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.canercelik.mancala.enums.GameConfig.*;
import static com.canercelik.mancala.enums.PitType.HOUSE;
import static com.canercelik.mancala.enums.PitType.STORE;
import static com.canercelik.mancala.enums.PlayerTurn.FIRST;
import static com.canercelik.mancala.enums.PlayerTurn.SECOND;


@Service
public class BoardServiceImpl implements BoardService {


    public List<PitEntity> create() {
        return newBoard();
    }

    @NotNull
    public List<PitEntity> newBoard() {
        List<PitEntity> board = new ArrayList<>();
        board.addAll(playerHouses(FIRST));
        board.addAll(playerHouses(SECOND));

        return board;
    }

    @NotNull
    public List<PitEntity> playerHouses(PlayerTurn playerTurn)
    {
       List<PitEntity> playerEntities = new ArrayList<>();
        for(int i = 0; i< PLAYER_PITS -1; i++)
        {
            PitEntity tempEntity = PitEntity.builder()
                    .owner(playerTurn)
                    .seeds(SEEDS_PER_PIT)
                    .pitType(HOUSE)
                    .oppositeId(calculateOppositeId(i, playerTurn))
                    .build();
            playerEntities.add(tempEntity);
        }
        playerEntities
                .add(PitEntity.builder()
                        .owner(playerTurn)
                        .pitType(STORE)
                        .seeds(0)
                        .oppositeId(-1)
                        .build());
        return playerEntities;
    }

    @Contract(pure = true)
    public int calculateOppositeId(int id, @NotNull PlayerTurn playerTurn){
        if(playerTurn.equals(FIRST)){
            return (TOTAL_PITS - 2) - id;
        }
        else return (TOTAL_PITS /2- 2) - id;
    }
}
