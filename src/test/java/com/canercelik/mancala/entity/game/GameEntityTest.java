package com.canercelik.mancala.entity.game;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PlayerTurn;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class GameEntityTest {

    /**
     * Method under test: {@link GameEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new GameEntity()).canEqual("Other"));
    }

    /**
     * Method under test: {@link GameEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        GameEntity gameEntity = new GameEntity();
        assertTrue(gameEntity.canEqual(new GameEntity()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#GameEntity()}
     *   <li>{@link GameEntity#setBoard(List)}
     *   <li>{@link GameEntity#setFirstPlayerEntity(PlayerEntity)}
     *   <li>{@link GameEntity#setPlayerTurn(PlayerTurn)}
     *   <li>{@link GameEntity#setSecondPlayerEntity(PlayerEntity)}
     *   <li>{@link GameEntity#setStatus(GameStatus)}
     *   <li>{@link GameEntity#setTotalTurn(int)}
     *   <li>{@link GameEntity#setUuid(UUID)}
     *   <li>{@link GameEntity#toString()}
     *   <li>{@link GameEntity#getBoard()}
     *   <li>{@link GameEntity#getFirstPlayerEntity()}
     *   <li>{@link GameEntity#getPlayerTurn()}
     *   <li>{@link GameEntity#getSecondPlayerEntity()}
     *   <li>{@link GameEntity#getStatus()}
     *   <li>{@link GameEntity#getTotalTurn()}
     *   <li>{@link GameEntity#getUuid()}
     * </ul>
     */
    @Test
    void testConstructor() {
        GameEntity actualGameEntity = new GameEntity();
        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        actualGameEntity.setBoard(pitEntityList);
        PlayerEntity playerEntity = new PlayerEntity();
        actualGameEntity.setFirstPlayerEntity(playerEntity);
        actualGameEntity.setPlayerTurn(PlayerTurn.FIRST);
        PlayerEntity playerEntity1 = new PlayerEntity();
        actualGameEntity.setSecondPlayerEntity(playerEntity1);
        actualGameEntity.setStatus(GameStatus.START);
        actualGameEntity.setTotalTurn(1);
        UUID randomUUIDResult = UUID.randomUUID();
        actualGameEntity.setUuid(randomUUIDResult);
        actualGameEntity.toString();
        assertSame(pitEntityList, actualGameEntity.getBoard());
        PlayerEntity firstPlayerEntity = actualGameEntity.getFirstPlayerEntity();
        assertSame(playerEntity, firstPlayerEntity);
        assertEquals(playerEntity1, firstPlayerEntity);
        assertEquals(PlayerTurn.FIRST, actualGameEntity.getPlayerTurn());
        PlayerEntity secondPlayerEntity = actualGameEntity.getSecondPlayerEntity();
        assertSame(playerEntity1, secondPlayerEntity);
        assertEquals(firstPlayerEntity, secondPlayerEntity);
        assertEquals(GameStatus.START, actualGameEntity.getStatus());
        assertEquals(1, actualGameEntity.getTotalTurn());
        assertSame(randomUUIDResult, actualGameEntity.getUuid());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#GameEntity(UUID, PlayerEntity, PlayerEntity, List, GameStatus, int, PlayerTurn)}
     *   <li>{@link GameEntity#setBoard(List)}
     *   <li>{@link GameEntity#setFirstPlayerEntity(PlayerEntity)}
     *   <li>{@link GameEntity#setPlayerTurn(PlayerTurn)}
     *   <li>{@link GameEntity#setSecondPlayerEntity(PlayerEntity)}
     *   <li>{@link GameEntity#setStatus(GameStatus)}
     *   <li>{@link GameEntity#setTotalTurn(int)}
     *   <li>{@link GameEntity#setUuid(UUID)}
     *   <li>{@link GameEntity#toString()}
     *   <li>{@link GameEntity#getBoard()}
     *   <li>{@link GameEntity#getFirstPlayerEntity()}
     *   <li>{@link GameEntity#getPlayerTurn()}
     *   <li>{@link GameEntity#getSecondPlayerEntity()}
     *   <li>{@link GameEntity#getStatus()}
     *   <li>{@link GameEntity#getTotalTurn()}
     *   <li>{@link GameEntity#getUuid()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        UUID uuid = UUID.randomUUID();
        PlayerEntity playerEntity = new PlayerEntity();
        PlayerEntity playerEntity1 = new PlayerEntity();
        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        GameEntity actualGameEntity = new GameEntity(uuid, playerEntity, playerEntity1, pitEntityList, GameStatus.START,
                1, PlayerTurn.FIRST);
        ArrayList<PitEntity> pitEntityList1 = new ArrayList<>();
        actualGameEntity.setBoard(pitEntityList1);
        PlayerEntity playerEntity2 = new PlayerEntity();
        actualGameEntity.setFirstPlayerEntity(playerEntity2);
        actualGameEntity.setPlayerTurn(PlayerTurn.FIRST);
        PlayerEntity playerEntity3 = new PlayerEntity();
        actualGameEntity.setSecondPlayerEntity(playerEntity3);
        actualGameEntity.setStatus(GameStatus.START);
        actualGameEntity.setTotalTurn(1);
        UUID randomUUIDResult = UUID.randomUUID();
        actualGameEntity.setUuid(randomUUIDResult);
        actualGameEntity.toString();
        List<PitEntity> board = actualGameEntity.getBoard();
        assertSame(pitEntityList1, board);
        assertEquals(pitEntityList, board);
        PlayerEntity firstPlayerEntity = actualGameEntity.getFirstPlayerEntity();
        assertSame(playerEntity2, firstPlayerEntity);
        assertEquals(playerEntity, firstPlayerEntity);
        assertEquals(playerEntity1, firstPlayerEntity);
        assertEquals(playerEntity3, firstPlayerEntity);
        assertEquals(PlayerTurn.FIRST, actualGameEntity.getPlayerTurn());
        PlayerEntity secondPlayerEntity = actualGameEntity.getSecondPlayerEntity();
        assertSame(playerEntity3, secondPlayerEntity);
        assertEquals(playerEntity, secondPlayerEntity);
        assertEquals(playerEntity1, secondPlayerEntity);
        assertEquals(firstPlayerEntity, secondPlayerEntity);
        assertEquals(GameStatus.START, actualGameEntity.getStatus());
        assertEquals(1, actualGameEntity.getTotalTurn());
        assertSame(randomUUIDResult, actualGameEntity.getUuid());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new GameEntity(), null);
        assertNotEquals(new GameEntity(), "Different type to GameEntity");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        GameEntity gameEntity = new GameEntity();
        assertEquals(gameEntity, gameEntity);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        GameEntity gameEntity = new GameEntity();
        GameEntity gameEntity1 = new GameEntity();
        assertEquals(gameEntity, gameEntity1);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity1.hashCode());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals4() {
        UUID uuid = UUID.randomUUID();
        PlayerEntity firstPlayerEntity = new PlayerEntity();
        PlayerEntity secondPlayerEntity = new PlayerEntity();
        GameEntity gameEntity = new GameEntity(uuid, firstPlayerEntity, secondPlayerEntity, new ArrayList<>(),
                GameStatus.START, 1, PlayerTurn.FIRST);
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals5() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setUuid(UUID.randomUUID());
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals6() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setFirstPlayerEntity(new PlayerEntity());
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals7() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setSecondPlayerEntity(new PlayerEntity());
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals8() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setBoard(new ArrayList<>());
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals9() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setStatus(GameStatus.START);
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals10() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setPlayerTurn(PlayerTurn.FIRST);
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals11() {
        GameEntity gameEntity = new GameEntity();

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setUuid(UUID.randomUUID());
        assertNotEquals(gameEntity, gameEntity1);
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals12() {
        GameEntity gameEntity = new GameEntity();

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setFirstPlayerEntity(new PlayerEntity());
        assertNotEquals(gameEntity, gameEntity1);
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals13() {
        GameEntity gameEntity = new GameEntity();

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setSecondPlayerEntity(new PlayerEntity());
        assertNotEquals(gameEntity, gameEntity1);
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals14() {
        GameEntity gameEntity = new GameEntity();

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setBoard(new ArrayList<>());
        assertNotEquals(gameEntity, gameEntity1);
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals15() {
        GameEntity gameEntity = new GameEntity();

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setStatus(GameStatus.START);
        assertNotEquals(gameEntity, gameEntity1);
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals16() {
        GameEntity gameEntity = new GameEntity();

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setPlayerTurn(PlayerTurn.FIRST);
        assertNotEquals(gameEntity, gameEntity1);
    }

    /**
     * Method under test: {@link GameEntity#equals(Object)}
     */
    @Test
    void testEquals17() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setFirstPlayerEntity(mock(PlayerEntity.class));
        assertNotEquals(gameEntity, new GameEntity());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals18() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setFirstPlayerEntity(new PlayerEntity());

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setFirstPlayerEntity(new PlayerEntity());
        assertEquals(gameEntity, gameEntity1);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals19() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setSecondPlayerEntity(new PlayerEntity());

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setSecondPlayerEntity(new PlayerEntity());
        assertEquals(gameEntity, gameEntity1);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals20() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setBoard(new ArrayList<>());

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setBoard(new ArrayList<>());
        assertEquals(gameEntity, gameEntity1);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals21() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setStatus(GameStatus.START);

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setStatus(GameStatus.START);
        assertEquals(gameEntity, gameEntity1);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity1.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GameEntity#equals(Object)}
     *   <li>{@link GameEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals22() {
        GameEntity gameEntity = new GameEntity();
        gameEntity.setPlayerTurn(PlayerTurn.FIRST);

        GameEntity gameEntity1 = new GameEntity();
        gameEntity1.setPlayerTurn(PlayerTurn.FIRST);
        assertEquals(gameEntity, gameEntity1);
        int expectedHashCodeResult = gameEntity.hashCode();
        assertEquals(expectedHashCodeResult, gameEntity1.hashCode());
    }

}
