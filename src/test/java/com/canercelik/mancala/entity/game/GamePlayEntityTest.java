package com.canercelik.mancala.entity.game;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.canercelik.mancala.enums.PlayerTurn;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class GamePlayEntityTest {

    /**
     * Method under test: {@link GamePlayEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new GamePlayEntity()).canEqual("Other"));
    }

    /**
     * Method under test: {@link GamePlayEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();
        assertTrue(gamePlayEntity.canEqual(new GamePlayEntity()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GamePlayEntity#GamePlayEntity()}
     *   <li>{@link GamePlayEntity#setPitIndex(int)}
     *   <li>{@link GamePlayEntity#setPlayerTurn(PlayerTurn)}
     *   <li>{@link GamePlayEntity#setUuid(UUID)}
     *   <li>{@link GamePlayEntity#toString()}
     *   <li>{@link GamePlayEntity#getPitIndex()}
     *   <li>{@link GamePlayEntity#getPlayerTurn()}
     *   <li>{@link GamePlayEntity#getUuid()}
     * </ul>
     */
    @Test
    void testConstructor() {
        GamePlayEntity actualGamePlayEntity = new GamePlayEntity();
        actualGamePlayEntity.setPitIndex(1);
        actualGamePlayEntity.setPlayerTurn(PlayerTurn.FIRST);
        UUID randomUUIDResult = UUID.randomUUID();
        actualGamePlayEntity.setUuid(randomUUIDResult);
        actualGamePlayEntity.toString();
        assertEquals(1, actualGamePlayEntity.getPitIndex());
        assertEquals(PlayerTurn.FIRST, actualGamePlayEntity.getPlayerTurn());
        assertSame(randomUUIDResult, actualGamePlayEntity.getUuid());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GamePlayEntity#GamePlayEntity(UUID, PlayerTurn, int)}
     *   <li>{@link GamePlayEntity#setPitIndex(int)}
     *   <li>{@link GamePlayEntity#setPlayerTurn(PlayerTurn)}
     *   <li>{@link GamePlayEntity#setUuid(UUID)}
     *   <li>{@link GamePlayEntity#toString()}
     *   <li>{@link GamePlayEntity#getPitIndex()}
     *   <li>{@link GamePlayEntity#getPlayerTurn()}
     *   <li>{@link GamePlayEntity#getUuid()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        GamePlayEntity actualGamePlayEntity = new GamePlayEntity(UUID.randomUUID(), PlayerTurn.FIRST, 1);
        actualGamePlayEntity.setPitIndex(1);
        actualGamePlayEntity.setPlayerTurn(PlayerTurn.FIRST);
        UUID randomUUIDResult = UUID.randomUUID();
        actualGamePlayEntity.setUuid(randomUUIDResult);
        actualGamePlayEntity.toString();
        assertEquals(1, actualGamePlayEntity.getPitIndex());
        assertEquals(PlayerTurn.FIRST, actualGamePlayEntity.getPlayerTurn());
        assertSame(randomUUIDResult, actualGamePlayEntity.getUuid());
    }

    /**
     * Method under test: {@link GamePlayEntity#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new GamePlayEntity(), null);
        assertNotEquals(new GamePlayEntity(), "Different type to GamePlayEntity");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GamePlayEntity#equals(Object)}
     *   <li>{@link GamePlayEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();
        assertEquals(gamePlayEntity, gamePlayEntity);
        int expectedHashCodeResult = gamePlayEntity.hashCode();
        assertEquals(expectedHashCodeResult, gamePlayEntity.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GamePlayEntity#equals(Object)}
     *   <li>{@link GamePlayEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();
        GamePlayEntity gamePlayEntity1 = new GamePlayEntity();
        assertEquals(gamePlayEntity, gamePlayEntity1);
        int expectedHashCodeResult = gamePlayEntity.hashCode();
        assertEquals(expectedHashCodeResult, gamePlayEntity1.hashCode());
    }

    /**
     * Method under test: {@link GamePlayEntity#equals(Object)}
     */
    @Test
    void testEquals4() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity(UUID.randomUUID(), PlayerTurn.FIRST, 1);
        assertNotEquals(gamePlayEntity, new GamePlayEntity());
    }

    /**
     * Method under test: {@link GamePlayEntity#equals(Object)}
     */
    @Test
    void testEquals5() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();
        gamePlayEntity.setUuid(UUID.randomUUID());
        assertNotEquals(gamePlayEntity, new GamePlayEntity());
    }

    /**
     * Method under test: {@link GamePlayEntity#equals(Object)}
     */
    @Test
    void testEquals6() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();
        gamePlayEntity.setPlayerTurn(PlayerTurn.FIRST);
        assertNotEquals(gamePlayEntity, new GamePlayEntity());
    }

    /**
     * Method under test: {@link GamePlayEntity#equals(Object)}
     */
    @Test
    void testEquals7() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();

        GamePlayEntity gamePlayEntity1 = new GamePlayEntity();
        gamePlayEntity1.setUuid(UUID.randomUUID());
        assertNotEquals(gamePlayEntity, gamePlayEntity1);
    }

    /**
     * Method under test: {@link GamePlayEntity#equals(Object)}
     */
    @Test
    void testEquals8() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();

        GamePlayEntity gamePlayEntity1 = new GamePlayEntity();
        gamePlayEntity1.setPlayerTurn(PlayerTurn.FIRST);
        assertNotEquals(gamePlayEntity, gamePlayEntity1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GamePlayEntity#equals(Object)}
     *   <li>{@link GamePlayEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals9() {
        GamePlayEntity gamePlayEntity = new GamePlayEntity();
        gamePlayEntity.setPlayerTurn(PlayerTurn.FIRST);

        GamePlayEntity gamePlayEntity1 = new GamePlayEntity();
        gamePlayEntity1.setPlayerTurn(PlayerTurn.FIRST);
        assertEquals(gamePlayEntity, gamePlayEntity1);
        int expectedHashCodeResult = gamePlayEntity.hashCode();
        assertEquals(expectedHashCodeResult, gamePlayEntity1.hashCode());
    }

}