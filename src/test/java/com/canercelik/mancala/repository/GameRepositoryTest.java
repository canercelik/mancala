package com.canercelik.mancala.repository;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.canercelik.mancala.entity.game.GameEntity;

import java.util.UUID;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {GameRepository.class})
@ExtendWith(SpringExtension.class)
class GameRepositoryTest {

    @Autowired
    private GameRepository gameRepository;

    /**
     * Method under test: {@link GameRepository#save(GameEntity)}
     */
    @Test
    void testSave() {
        GameEntity gameEntity = new GameEntity();
        assertSame(gameEntity, gameRepository.save(gameEntity));
    }

    /**
     * Method under test: {@link GameRepository#save(GameEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSave2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.game.GameEntity.getUuid()" because "gameEntity" is null
        //       at com.canercelik.mancala.repository.GameRepository.save(GameRepository.java:15)
        //   In order to prevent save(GameEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   save(GameEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        gameRepository.save(null);
    }

    /**
     * Method under test: {@link GameRepository#save(GameEntity)}
     */
    @Test
    void testSave3() {
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getUuid()).thenReturn(UUID.randomUUID());
        gameRepository.save(gameEntity);
        verify(gameEntity).getUuid();
    }

    /**
     * Method under test: {@link GameRepository#update(GameEntity)}
     */
    @Test
    void testUpdate() {
        GameEntity gameEntity = new GameEntity();
        assertSame(gameEntity, gameRepository.update(gameEntity));
    }

    /**
     * Method under test: {@link GameRepository#update(GameEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.game.GameEntity.getUuid()" because "gameEntity" is null
        //       at com.canercelik.mancala.repository.GameRepository.update(GameRepository.java:20)
        //   In order to prevent update(GameEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   update(GameEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        gameRepository.update(null);
    }

    /**
     * Method under test: {@link GameRepository#update(GameEntity)}
     */
    @Test
    void testUpdate3() {
        GameEntity gameEntity = mock(GameEntity.class);
        when(gameEntity.getUuid()).thenReturn(UUID.randomUUID());
        gameRepository.update(gameEntity);
        verify(gameEntity).getUuid();
    }

    /**
     * Method under test: {@link GameRepository#findById(UUID)}
     */
    @Test
    void testFindById() {
        assertNull(gameRepository.findById(UUID.randomUUID()));
    }

    /**
     * Method under test: {@link GameRepository#delete(UUID)}
     */
    @Test
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by delete(UUID)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        gameRepository.delete(UUID.randomUUID());
    }

}