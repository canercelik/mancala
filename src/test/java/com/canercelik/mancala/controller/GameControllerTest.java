package com.canercelik.mancala.controller;

import com.canercelik.mancala.business.GameBusiness;
import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.game.GameStartEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PlayerTurn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class GameControllerTest {
    @Mock
    GameBusiness business;
    @InjectMocks
    GameController gameController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testHomeRequest() {
        when(business.newGame()).thenReturn(new GameStartEntity("firstPlayer", "secondPlayer"));

        String result = gameController.homeRequest(null);
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testNewGame() {
        when(business.newGamePlay()).thenReturn(new GamePlayEntity(null, PlayerTurn.FIRST, 0));
        when(business.start(any())).thenReturn(new GameEntity(null, null, null, List.of(null), GameStatus.START, 0, PlayerTurn.FIRST));

        String result = gameController.newGame(new GameStartEntity("firstPlayer", "secondPlayer"), null);
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testGamePlay() {
        when(business.play(any())).thenReturn(new GameEntity(null, null, null, List.of(null), GameStatus.START, 0, PlayerTurn.FIRST));

        GameEntity result = gameController.gamePlay(new GamePlayEntity(null, PlayerTurn.FIRST, 0));
        Assertions.assertEquals(new GameEntity(null, null, null, List.of(null), GameStatus.START, 0, PlayerTurn.FIRST), result);
    }
}