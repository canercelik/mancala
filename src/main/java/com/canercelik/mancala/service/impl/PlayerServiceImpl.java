package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.repository.PlayerRepository;
import com.canercelik.mancala.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository repository = new PlayerRepository();

    public PlayerEntity create(String playerName, PlayerTurn playerTurn) {
        //logger.debug("Creating player against name {}, with type {}", playerName, playerType);
        return repository.save(
                PlayerEntity.builder()
                .uuid(UUID.randomUUID())
                .playerName(playerName)
                .order(playerTurn).build());
    }
}
