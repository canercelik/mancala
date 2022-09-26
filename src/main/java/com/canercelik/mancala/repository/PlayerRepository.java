package com.canercelik.mancala.repository;

import com.canercelik.mancala.entity.PlayerEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class PlayerRepository {
    private final Map<UUID, PlayerEntity>  playerRepository = new HashMap<>();

    public PlayerEntity save(PlayerEntity playerEntity) {
        playerRepository.put(playerEntity.getUuid(), playerEntity);
        return playerEntity;
    }
    public PlayerEntity findById(UUID uuid) {
        return playerRepository.get(uuid);
    }
}
