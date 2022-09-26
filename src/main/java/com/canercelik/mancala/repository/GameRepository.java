package com.canercelik.mancala.repository;

import com.canercelik.mancala.entity.game.GameEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
@Repository
public class GameRepository {

    private final Map<UUID, GameEntity> gameRepository = new HashMap<>();

    public GameEntity save(GameEntity gameEntity) {
        gameRepository.put(gameEntity.getUuid(), gameEntity);
        return gameEntity;
    }

    public GameEntity update(GameEntity gameEntity){
        gameRepository.replace(gameEntity.getUuid(), gameEntity);
        return gameEntity;
    }

    public GameEntity findById(UUID uuid) {
        return gameRepository.get(uuid);
    }
    public void delete(UUID uuid){
        gameRepository.clear();
    }
}
