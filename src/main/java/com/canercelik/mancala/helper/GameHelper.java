package com.canercelik.mancala.helper;

import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.service.impl.PitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.canercelik.mancala.enums.GameConfig.*;
import static com.canercelik.mancala.enums.GameStatus.END;
import static com.canercelik.mancala.enums.GameStatus.PROGRESS;
import static com.canercelik.mancala.enums.PitType.HOUSE;
import static com.canercelik.mancala.enums.PitType.STORE;
import static com.canercelik.mancala.enums.PlayerTurn.FIRST;
import static com.canercelik.mancala.enums.PlayerTurn.SECOND;

@Service
public class GameHelper {

    @Autowired
    PitServiceImpl pitService;

    public GameEntity play(GameEntity gameEntity, int pitIndex, PlayerTurn playerTurn){
        return sowSeeds(gameEntity, pitIndex, playerTurn);
    }

    private GameEntity sowSeeds(GameEntity gameEntity, int pitIndex, PlayerTurn playerTurn){
        List<PitEntity> board = gameEntity.getBoard();
        int lastIndex = distributeSeeds(board, pitIndex);

        if(isCaptureConditionMet(board, lastIndex, playerTurn)){
            board = capture(board, lastIndex, playerTurn);
        }

        return updateGameEntityStatus(gameEntity, board, lastIndex, playerTurn);
    }

    private int distributeSeeds(List<PitEntity> board, int pitIndex) {
        int lastIndex = pitIndex;
        int pitSeeds = board.get(pitIndex).take();
        for(int i = 1; i <= pitSeeds; i++)
        {
            lastIndex  = (lastIndex + 1) % TOTAL_PITS;
            board.set(lastIndex, pitService.sow(board.get(lastIndex)));
        }
        return lastIndex;
    }

    private boolean isCaptureConditionMet(List<PitEntity> board, int lastIndex, PlayerTurn playerTurn) {
        return board.get(lastIndex).getOwner() == playerTurn
                && board.get(lastIndex).getPitType().equals(HOUSE)
                && board.get(lastIndex).getSeeds() == 1
                && !board.get(board.get(lastIndex).getOppositeId()).isEmpty();
    }

    private GameEntity updateGameEntityStatus(GameEntity gameEntity, List<PitEntity> board, int lastIndex, PlayerTurn playerTurn) {
        GameStatus tempStatus = verifyGameStatus(board);
        gameEntity.setStatus(tempStatus);
        gameEntity.setTotalTurn(gameEntity.getTotalTurn() + 1);
        gameEntity.setBoard(board);
        if(!tempStatus.equals(END) && !board.get(lastIndex).getPitType().equals(STORE)) {
            gameEntity.setPlayerTurn(changePlayer(playerTurn));
        }
        return gameEntity;
    }

    private PlayerTurn changePlayer(PlayerTurn playerTurn) {
        return playerTurn == FIRST ? SECOND : FIRST;
    }

    private List<PitEntity> finishGame(List<PitEntity> board) {
        for(int i = 0; i < FIRST_PLAYER_STORE_INDEX; i++){
            board.set(FIRST_PLAYER_STORE_INDEX, pitService.sow(board.get(FIRST_PLAYER_STORE_INDEX), board.get(i).take()));
        }
        for(int i = FIRST_PLAYER_STORE_INDEX + 1; i < TOTAL_PITS; i++){
            board.set(SECOND_PLAYER_STORE_INDEX, pitService.sow(board.get(SECOND_PLAYER_STORE_INDEX), board.get(i).take()));
        }
        return board;
    }

    private GameStatus verifyGameStatus(List<PitEntity> board) {
        boolean firstPlayersPits = true;
        boolean secondPlayersPits = true;

        for(int i = 0; i < FIRST_PLAYER_STORE_INDEX; i++){
            if(!board.get(i).isEmpty()){
                firstPlayersPits = false;
            }
        }

        for(int i = FIRST_PLAYER_STORE_INDEX + 1; i < SECOND_PLAYER_STORE_INDEX; i++){
            if(!board.get(i).isEmpty()){
                secondPlayersPits = false;
            }
        }
        return firstPlayersPits || secondPlayersPits ? END : PROGRESS;
    }

    private List<PitEntity> capture(List<PitEntity> board, int lastIndex, PlayerTurn playerTurn) {
        int ownersTake = board.get(lastIndex).take();
        int opponentId = board.get(lastIndex).getOppositeId();
        int opponentsTake = board.get(opponentId).take();
        return sowStore(board, opponentsTake + ownersTake, playerTurn);
    }

    private List<PitEntity> sowStore(List<PitEntity> board, int seeds, PlayerTurn playerTurn) {
        int storeIndex = playerTurn == FIRST ? FIRST_PLAYER_STORE_INDEX : SECOND_PLAYER_STORE_INDEX;
        board.set(storeIndex, pitService.sow(board.get(storeIndex), seeds));
        return board;
    }
}