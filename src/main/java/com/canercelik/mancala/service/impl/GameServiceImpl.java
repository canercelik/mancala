package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.helper.GameHelper;
import com.canercelik.mancala.repository.GameRepository;
import com.canercelik.mancala.service.GameService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

import static com.canercelik.mancala.enums.GameStatus.START;
import static com.canercelik.mancala.enums.PlayerTurn.FIRST;
import static com.canercelik.mancala.enums.PlayerTurn.SECOND;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Autowired
    private GameHelper helper;

    @Autowired
    private PlayerServiceImpl playerService;

    @Autowired
    private BoardServiceImpl boardService;

    @Override
    public GameEntity start(String firstPlayer, String secondPlayer) {
        return repository.save(
                GameEntity
                        .builder()
                        .uuid(UUID.randomUUID())
                        .firstPlayerEntity(playerService.create(firstPlayer, FIRST))
                        .secondPlayerEntity(playerService.create(secondPlayer, SECOND))
                        .board(boardService.create())
                        .status(START)
                        .playerTurn(FIRST)
                        .totalTurn(0)
                        .build());
    }

    public GameEntity play(@NotNull GamePlayEntity gamePlayEntity){

        GameEntity gameEntity = repository.findById(gamePlayEntity.getUuid());

        if(gamePlayEntity.getPlayerTurn().equals(gameEntity.getPlayerTurn())){
            if(!gameEntity.getBoard().get(gamePlayEntity.getPitIndex()).isEmpty()){

                helper.play(gameEntity, gamePlayEntity.getPitIndex(), gameEntity.getPlayerTurn());
            }
        }
        return repository.update(gameEntity);
    }

    @Override
    public GameEntity getGameById(UUID gameId) {
        return repository.findById(gameId);
    }

    @Override
    public void delete(UUID uuid) {
        repository.delete(uuid);
    }
}