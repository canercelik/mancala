package com.canercelik.mancala.entity.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GameStartEntityTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameStartEntity#GameStartEntity()}
     *   <li>{@link GameStartEntity#setFirstPlayer(String)}
     *   <li>{@link GameStartEntity#setSecondPlayer(String)}
     *   <li>{@link GameStartEntity#getFirstPlayer()}
     *   <li>{@link GameStartEntity#getSecondPlayer()}
     * </ul>
     */
    @Test
    void testConstructor() {
        GameStartEntity actualGameStartEntity = new GameStartEntity();
        actualGameStartEntity.setFirstPlayer("First Player");
        actualGameStartEntity.setSecondPlayer("Second Player");
        assertEquals("First Player", actualGameStartEntity.getFirstPlayer());
        assertEquals("Second Player", actualGameStartEntity.getSecondPlayer());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameStartEntity#GameStartEntity(String, String)}
     *   <li>{@link GameStartEntity#setFirstPlayer(String)}
     *   <li>{@link GameStartEntity#setSecondPlayer(String)}
     *   <li>{@link GameStartEntity#getFirstPlayer()}
     *   <li>{@link GameStartEntity#getSecondPlayer()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        GameStartEntity actualGameStartEntity = new GameStartEntity("First Player", "Second Player");
        actualGameStartEntity.setFirstPlayer("First Player");
        actualGameStartEntity.setSecondPlayer("Second Player");
        assertEquals("First Player", actualGameStartEntity.getFirstPlayer());
        assertEquals("Second Player", actualGameStartEntity.getSecondPlayer());
    }
}