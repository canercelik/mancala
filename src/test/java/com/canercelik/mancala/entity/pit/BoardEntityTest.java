package com.canercelik.mancala.entity.pit;

import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

class BoardEntityTest {

    /**
     * Method under test: {@link BoardEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual() {
        assertFalse((new BoardEntity()).canEqual("Other"));
    }

    /**
     * Method under test: {@link BoardEntity#canEqual(Object)}
     */
    @Test
    void testCanEqual2() {
        BoardEntity boardEntity = new BoardEntity();
        assertTrue(boardEntity.canEqual(new BoardEntity()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BoardEntity#BoardEntity()}
     *   <li>{@link BoardEntity#setBoard(List)}
     *   <li>{@link BoardEntity#toString()}
     *   <li>{@link BoardEntity#getBoard()}
     * </ul>
     */
    @Test
    void testConstructor() {
        BoardEntity actualBoardEntity = new BoardEntity();
        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        actualBoardEntity.setBoard(pitEntityList);
        String actualToStringResult = actualBoardEntity.toString();
        assertSame(pitEntityList, actualBoardEntity.getBoard());
        assertEquals("BoardEntity(board=[])", actualToStringResult);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BoardEntity#BoardEntity(List)}
     *   <li>{@link BoardEntity#setBoard(List)}
     *   <li>{@link BoardEntity#toString()}
     *   <li>{@link BoardEntity#getBoard()}
     * </ul>
     */
    @Test
    void testConstructor2() {
        ArrayList<PitEntity> pitEntityList = new ArrayList<>();
        BoardEntity actualBoardEntity = new BoardEntity(pitEntityList);
        ArrayList<PitEntity> pitEntityList1 = new ArrayList<>();
        actualBoardEntity.setBoard(pitEntityList1);
        String actualToStringResult = actualBoardEntity.toString();
        List<PitEntity> board = actualBoardEntity.getBoard();
        assertSame(pitEntityList1, board);
        assertEquals(pitEntityList, board);
        assertEquals("BoardEntity(board=[])", actualToStringResult);
    }

    /**
     * Method under test: {@link BoardEntity#equals(Object)}
     */
    @Test
    void testEquals() {
        assertNotEquals(new BoardEntity(), null);
        assertNotEquals(new BoardEntity(), "Different type to BoardEntity");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BoardEntity#equals(Object)}
     *   <li>{@link BoardEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals2() {
        BoardEntity boardEntity = new BoardEntity();
        assertEquals(boardEntity, boardEntity);
        int expectedHashCodeResult = boardEntity.hashCode();
        assertEquals(expectedHashCodeResult, boardEntity.hashCode());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BoardEntity#equals(Object)}
     *   <li>{@link BoardEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals3() {
        BoardEntity boardEntity = new BoardEntity();
        BoardEntity boardEntity1 = new BoardEntity();
        assertEquals(boardEntity, boardEntity1);
        int expectedHashCodeResult = boardEntity.hashCode();
        assertEquals(expectedHashCodeResult, boardEntity1.hashCode());
    }

    /**
     * Method under test: {@link BoardEntity#equals(Object)}
     */
    @Test
    void testEquals4() {
        BoardEntity boardEntity = new BoardEntity(new ArrayList<>());
        assertNotEquals(boardEntity, new BoardEntity());
    }

    /**
     * Method under test: {@link BoardEntity#equals(Object)}
     */
    @Test
    void testEquals5() {
        BoardEntity boardEntity = new BoardEntity();
        assertNotEquals(boardEntity, new BoardEntity(new ArrayList<>()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BoardEntity#equals(Object)}
     *   <li>{@link BoardEntity#hashCode()}
     * </ul>
     */
    @Test
    void testEquals6() {
        BoardEntity boardEntity = new BoardEntity(new ArrayList<>());
        BoardEntity boardEntity1 = new BoardEntity(new ArrayList<>());
        assertEquals(boardEntity, boardEntity1);
        int expectedHashCodeResult = boardEntity.hashCode();
        assertEquals(expectedHashCodeResult, boardEntity1.hashCode());
    }

}
