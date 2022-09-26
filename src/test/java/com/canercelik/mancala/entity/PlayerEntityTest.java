package com.canercelik.mancala.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.canercelik.mancala.enums.PlayerTurn;

import java.util.UUID;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerEntityTest {
    PlayerEntity playerEntity = new PlayerEntity(null, "playerName", PlayerTurn.FIRST);

    /**
     * Method under test: {@link PlayerEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        assertFalse((new PlayerEntity()).canEqual("Other"));
    }

    /**
     * Method under test: {@link PlayerEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual3() {
        PlayerEntity playerEntity = new PlayerEntity();
        assertTrue(playerEntity.canEqual(new PlayerEntity()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PlayerEntity#PlayerEntity()}
     *   <li>{@link PlayerEntity#setOrder(PlayerTurn)}
     *   <li>{@link PlayerEntity#setPlayerName(String)}
     *   <li>{@link PlayerEntity#setUuid(UUID)}
     *   <li>{@link PlayerEntity#toString()}
     *   <li>{@link PlayerEntity#getOrder()}
     *   <li>{@link PlayerEntity#getPlayerName()}
     *   <li>{@link PlayerEntity#getUuid()}
     * </ul>
     */
    @Test
    void testConstructor() {
        PlayerEntity actualPlayerEntity = new PlayerEntity();
        actualPlayerEntity.setOrder(PlayerTurn.FIRST);
        actualPlayerEntity.setPlayerName("Player Name");
        UUID randomUUIDResult = UUID.randomUUID();
        actualPlayerEntity.setUuid(randomUUIDResult);
        actualPlayerEntity.toString();
        assertEquals(PlayerTurn.FIRST, actualPlayerEntity.getOrder());
        assertEquals("Player Name", actualPlayerEntity.getPlayerName());
        assertSame(randomUUIDResult, actualPlayerEntity.getUuid());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PlayerEntity#PlayerEntity(UUID, String, PlayerTurn)}
     *   <li>{@link PlayerEntity#setOrder(PlayerTurn)}
     *   <li>{@link PlayerEntity#setPlayerName(String)}
     *   <li>{@link PlayerEntity#setUuid(UUID)}
     *   <li>{@link PlayerEntity#toString()}
     *   <li>{@link PlayerEntity#getOrder()}
     *   <li>{@link PlayerEntity#getPlayerName()}
     *   <li>{@link PlayerEntity#getUuid()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        PlayerEntity actualPlayerEntity = new PlayerEntity(UUID.randomUUID(), "Player Name", PlayerTurn.FIRST);
        actualPlayerEntity.setOrder(PlayerTurn.FIRST);
        actualPlayerEntity.setPlayerName("Player Name");
        UUID randomUUIDResult = UUID.randomUUID();
        actualPlayerEntity.setUuid(randomUUIDResult);
        actualPlayerEntity.toString();
        assertEquals(PlayerTurn.FIRST, actualPlayerEntity.getOrder());
        assertEquals("Player Name", actualPlayerEntity.getPlayerName());
        assertSame(randomUUIDResult, actualPlayerEntity.getUuid());
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals2() {
        assertNotEquals(new PlayerEntity(), null);
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals3() {
        assertNotEquals(new PlayerEntity(), "Different type to PlayerEntity");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PlayerEntity#equals(Object)}
     *   <li>{@link PlayerEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals4() {
        PlayerEntity playerEntity = new PlayerEntity();
        assertEquals(playerEntity, playerEntity);
        int expectedHashCodeResult = playerEntity.hashCode();
        assertEquals(expectedHashCodeResult, playerEntity.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PlayerEntity#equals(Object)}
     *   <li>{@link PlayerEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals5() {
        PlayerEntity playerEntity = new PlayerEntity();
        PlayerEntity playerEntity1 = new PlayerEntity();
        assertEquals(playerEntity, playerEntity1);
        int expectedHashCodeResult = playerEntity.hashCode();
        assertEquals(expectedHashCodeResult, playerEntity1.hashCode());
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals6() {
        PlayerEntity playerEntity = new PlayerEntity(UUID.randomUUID(), "Player Name", PlayerTurn.FIRST);
        assertNotEquals(playerEntity, new PlayerEntity());
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals7() {
        PlayerEntity playerEntity = new PlayerEntity();
        assertNotEquals(playerEntity, new PlayerEntity(UUID.randomUUID(), "Player Name", PlayerTurn.FIRST));
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals8() {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setPlayerName("Player Name");
        assertNotEquals(playerEntity, new PlayerEntity());
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals9() {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setOrder(PlayerTurn.FIRST);
        assertNotEquals(playerEntity, new PlayerEntity());
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals10() {
        PlayerEntity playerEntity = new PlayerEntity();

        PlayerEntity playerEntity1 = new PlayerEntity();
        playerEntity1.setPlayerName("Player Name");
        assertNotEquals(playerEntity, playerEntity1);
    }

    /**
     * Method under test: {@link PlayerEntity#equals(Object)}
     */
    @Test
    void testEquals11() {
        PlayerEntity playerEntity = new PlayerEntity();

        PlayerEntity playerEntity1 = new PlayerEntity();
        playerEntity1.setOrder(PlayerTurn.FIRST);
        assertNotEquals(playerEntity, playerEntity1);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PlayerEntity#equals(Object)}
     *   <li>{@link PlayerEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals12() {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setPlayerName("Player Name");

        PlayerEntity playerEntity1 = new PlayerEntity();
        playerEntity1.setPlayerName("Player Name");
        assertEquals(playerEntity, playerEntity1);
        int expectedHashCodeResult = playerEntity.hashCode();
        assertEquals(expectedHashCodeResult, playerEntity1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PlayerEntity#equals(Object)}
     *   <li>{@link PlayerEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals13() {
        PlayerEntity playerEntity = new PlayerEntity();
        playerEntity.setOrder(PlayerTurn.FIRST);

        PlayerEntity playerEntity1 = new PlayerEntity();
        playerEntity1.setOrder(PlayerTurn.FIRST);
        assertEquals(playerEntity, playerEntity1);
        int expectedHashCodeResult = playerEntity.hashCode();
        assertEquals(expectedHashCodeResult, playerEntity1.hashCode());
    }

    @Test
    void testSetUuid() {
        playerEntity.setUuid(null);
    }

    @Test
    void testSetPlayerName() {
        playerEntity.setPlayerName("playerName");
    }

    @Test
    void testSetOrder() {
        playerEntity.setOrder(PlayerTurn.FIRST);
    }

    @Test
    void testEquals() {
        boolean result = playerEntity.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = playerEntity.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = playerEntity.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = playerEntity.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testBuilder() {
        PlayerEntity.PlayerEntityBuilder result = PlayerEntity.builder();
        Assertions.assertEquals(null, result);
    }
}