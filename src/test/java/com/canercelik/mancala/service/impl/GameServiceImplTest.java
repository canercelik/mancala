package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.entity.game.GameEntity;
import com.canercelik.mancala.entity.game.GamePlayEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.helper.GameHelper;
import com.canercelik.mancala.repository.GameRepository;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {GameServiceImpl.class})
@ExtendWith(SpringExtension.class)
class GameServiceImplTest {

    @MockBean
    private GameRepository gameRepository;

    @Autowired
    private GameServiceImpl gameServiceImpl;

    /**
     * Method under test: {@link GameServiceImpl#start(String, String)}
     */
    @Test
    void testStart() {
        GameEntity gameEntity = new GameEntity();
        when(gameRepository.save((GameEntity) any())).thenReturn(gameEntity);
        assertSame(gameEntity, gameServiceImpl.start("First Player", "Second Player"));
        verify(gameRepository).save((GameEntity) any());
    }

    /**
     * Method under test: {@link GameServiceImpl#play(GamePlayEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.enums.PlayerTurn.equals(Object)" because the return value of "com.canercelik.mancala.entity.game.GamePlayEntity.getPlayerTurn()" is null
        //       at com.canercelik.mancala.service.impl.GameServiceImpl.play(GameServiceImpl.java:47)
        //   In order to prevent play(GamePlayEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GamePlayEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        when(gameRepository.findById((UUID) any())).thenReturn(new GameEntity());
        gameServiceImpl.play(new GamePlayEntity());
    }

    /**
     * Method under test: {@link GameServiceImpl#play(GamePlayEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.game.GameEntity.getPlayerTurn()" because "gameEntity" is null
        //       at com.canercelik.mancala.service.impl.GameServiceImpl.play(GameServiceImpl.java:47)
        //   In order to prevent play(GamePlayEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GamePlayEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        when(gameRepository.findById((UUID) any())).thenReturn(null);
        gameServiceImpl.play(new GamePlayEntity());
    }

    /**
     * Method under test: {@link GameServiceImpl#play(GamePlayEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.enums.PlayerTurn.equals(Object)" because the return value of "com.canercelik.mancala.entity.game.GamePlayEntity.getPlayerTurn()" is null
        //       at com.canercelik.mancala.service.impl.GameServiceImpl.play(GameServiceImpl.java:47)
        //   In order to prevent play(GamePlayEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GamePlayEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        when(gameRepository.findById((UUID) any())).thenReturn(mock(GameEntity.class));
        gameServiceImpl.play(new GamePlayEntity());
    }

    /**
     * Method under test: {@link GameServiceImpl#play(GamePlayEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPlay4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at com.canercelik.mancala.service.impl.GameServiceImpl.play(GameServiceImpl.java:48)
        //   In order to prevent play(GamePlayEntity)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   play(GamePlayEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        when(gameRepository.update((GameEntity) any())).thenReturn(new GameEntity());
        when(gameRepository.findById((UUID) any())).thenReturn(mock(GameEntity.class));
        gameServiceImpl.play(new GamePlayEntity(UUID.randomUUID(), PlayerTurn.FIRST, 1));
    }

    /**
     * Method under test: {@link GameServiceImpl#getGameById(UUID)}
     */
    @Test
    void testGetGameById() {
        GameEntity gameEntity = new GameEntity();
        when(gameRepository.findById((UUID) any())).thenReturn(gameEntity);
        assertSame(gameEntity, gameServiceImpl.getGameById(UUID.randomUUID()));
        verify(gameRepository).findById((UUID) any());
    }

    /**
     * Method under test: {@link GameServiceImpl#delete(UUID)}
     */
    @Test
    void testDelete() {
        doNothing().when(gameRepository).delete((UUID) any());
        gameServiceImpl.delete(UUID.randomUUID());
        verify(gameRepository).delete((UUID) any());
    }
}
