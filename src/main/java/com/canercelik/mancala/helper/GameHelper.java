package com.canercelik.mancala.helper;

import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.service.impl.PitServiceImpl;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static com.canercelik.mancala.enums.GameConfig.*;
import static com.canercelik.mancala.enums.GameStatus.END;
import static com.canercelik.mancala.enums.GameStatus.PROGRESS;
import static com.canercelik.mancala.enums.PitType.HOUSE;
import static com.canercelik.mancala.enums.PitType.STORE;
import static com.canercelik.mancala.enums.PlayerTurn.FIRST;
import static com.canercelik.mancala.enums.PlayerTurn.SECOND;

public class GameHelper {

    @Autowired
    PitServiceImpl pitService = new PitServiceImpl();

    public GameEntity play(@NotNull GameEntity gameEntity, int pitIndex, PlayerTurn playerTurn){
        GameEntity newGameEntity = sowSeeds(gameEntity,pitIndex,playerTurn);

        return newGameEntity;
    }
    public GameEntity sowSeeds(@NotNull GameEntity gameEntity, int pitIndex, PlayerTurn playerTurn){
        List<PitEntity> board = gameEntity.getBoard();
        int pitSeeds = board.get(pitIndex).take();
        int lastIndex = pitIndex;
        for(int i = 1; i<=pitSeeds; i++)
        {
            lastIndex  = lastIndex+1;
            if(lastIndex == TOTAL_PITS){
                lastIndex = 0;
            }
            if(board.get(lastIndex).isSowable(playerTurn)){
                board.set(lastIndex, pitService.sow(board.get(lastIndex)));
            }
            else {
                lastIndex  = lastIndex+1;
                if(lastIndex == TOTAL_PITS){
                    lastIndex = 0;
                }
                board.set(lastIndex,pitService.sow(board.get(lastIndex)));
            }
        }

        if(board.get(lastIndex).getOwner() == playerTurn
                && board.get(lastIndex).getPitType().equals(HOUSE)
                && board.get(lastIndex).getSeeds() == 1
                && !board.get(board.get(lastIndex).getOppositeId()).isEmpty()){
            board = capture(board,lastIndex,playerTurn);
        }

        GameStatus tempStatus = verifyGameStatus(board,playerTurn);

        if(tempStatus.equals(END))
        {
            board = finishGame(board);
            gameEntity.setStatus(END);
            gameEntity.setBoard(board);
            return gameEntity;
        }
        else if(board.get(lastIndex).getPitType().equals(STORE))
        {
            gameEntity.setStatus(tempStatus);
            gameEntity.setTotalTurn(gameEntity.getTotalTurn()+1);
            gameEntity.setBoard(board);
            return gameEntity;

        } else {
            gameEntity.setStatus(tempStatus);
            gameEntity.setTotalTurn(gameEntity.getTotalTurn()+1);
            gameEntity.setBoard(board);
            gameEntity.setPlayerTurn(changePlayer(playerTurn));

            return gameEntity;
        }
    }

    @Contract(pure = true)
    private PlayerTurn changePlayer(@NotNull PlayerTurn playerTurn) {
        if(playerTurn.equals(FIRST)){
            return SECOND;
        }
        else return FIRST;
    }

    private List<PitEntity> finishGame(List<PitEntity> board) {
        for(int i=0; i<FIRST_PLAYER_STORE_INDEX; i++){
            board.set(FIRST_PLAYER_STORE_INDEX, pitService.sow(board.get(FIRST_PLAYER_STORE_INDEX),board.get(i).take()));

        }
        for(int i=FIRST_PLAYER_STORE_INDEX+1; i<TOTAL_PITS;i++){
            board.set(SECOND_PLAYER_STORE_INDEX, pitService.sow(board.get(SECOND_PLAYER_STORE_INDEX),board.get(i).take()));
        }
        return board;
    }

    private GameStatus verifyGameStatus(List<PitEntity> board, @NotNull PlayerTurn playerTurn) {
        boolean firstPlayersPits = true;
        boolean secondPlayersPits = true;

        for(int i=0; i<FIRST_PLAYER_STORE_INDEX; i++){
            if(!board.get(i).isEmpty()){
                firstPlayersPits = false;
            }
        }

        for(int i=FIRST_PLAYER_STORE_INDEX+1; i<SECOND_PLAYER_STORE_INDEX;i++){
            if(!board.get(i).isEmpty()){
                secondPlayersPits = false;
            }
        }
        if(firstPlayersPits || secondPlayersPits){
            return END;
        }
        else return PROGRESS;
    }

    public List<PitEntity> capture(@NotNull List<PitEntity> board, int lastIndex, PlayerTurn playerTurn) {

        int ownersTake = board.get(lastIndex).take();
        int opponentId = board.get(lastIndex).getOppositeId();
        int opponentsTake = board.get(opponentId).take();
        return sowStore(board, opponentsTake+ownersTake, playerTurn);
    }
    public List<PitEntity> sowStore(List<PitEntity> board, int seeds, @NotNull PlayerTurn playerTurn) {
        if(playerTurn.equals(FIRST)){
            board.set(FIRST_PLAYER_STORE_INDEX,pitService.sow(board.get(FIRST_PLAYER_STORE_INDEX),seeds));
        }
        else {
            board.set(SECOND_PLAYER_STORE_INDEX,pitService.sow(board.get(SECOND_PLAYER_STORE_INDEX),seeds));
        }
        return board;
    }

}
