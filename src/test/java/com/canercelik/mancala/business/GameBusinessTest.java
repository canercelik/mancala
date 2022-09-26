package com.canercelik.mancala.business;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.game.GameStartEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.service.impl.GameServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class GameBusinessTest {
    @Mock
    GameServiceImpl service;
    @InjectMocks
    GameBusiness gameBusiness;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testNewGame() {
        GameStartEntity result = gameBusiness.newGame();
        Assertions.assertEquals(new GameStartEntity("firstPlayer", "secondPlayer"), result);
    }

    @Test
    void testNewGamePlay() {
        GamePlayEntity result = gameBusiness.newGamePlay();
        Assertions.assertEquals(new GamePlayEntity(null, PlayerTurn.FIRST, 0), result);
    }

    @Test
    void testStart() {
        when(service.start(anyString(), anyString())).thenReturn(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST));

        GameEntity result = gameBusiness.start(new GameStartEntity("firstPlayer", "secondPlayer"));
        Assertions.assertEquals(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST), result);
    }

    @Test
    void testPlay() {
        when(service.play(any())).thenReturn(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST));

        GameEntity result = gameBusiness.play(new GamePlayEntity(null, PlayerTurn.FIRST, 0));
        Assertions.assertEquals(new GameEntity(null, new PlayerEntity(null, "playerName", PlayerTurn.FIRST), new PlayerEntity(null, "playerName", PlayerTurn.FIRST), List.of(new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE)), GameStatus.START, 0, PlayerTurn.FIRST), result);
    }
}