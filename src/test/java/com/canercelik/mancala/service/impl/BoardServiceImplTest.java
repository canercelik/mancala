package com.canercelik.mancala.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {BoardServiceImpl.class})
@ExtendWith(SpringExtension.class)
class BoardServiceImplTest {

    @Autowired
    private BoardServiceImpl boardServiceImpl;

    /**
     * Method under test: {@link BoardServiceImpl#create()}
     */
    @Test
    void testCreate() {
        List<PitEntity> actualCreateResult = boardServiceImpl.create();
        assertEquals(14, actualCreateResult.size());
        PitEntity getResult = actualCreateResult.get(2);
        assertEquals(PlayerTurn.FIRST, getResult.getOwner());
        assertEquals(10, getResult.getOppositeId());
        PitEntity getResult1 = actualCreateResult.get(12);
        assertEquals(1, getResult1.getSeeds());
        assertEquals(PitType.HOUSE, getResult1.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult1.getOwner());
        assertEquals(0, getResult1.getOppositeId());
        PitEntity getResult2 = actualCreateResult.get(11);
        assertEquals(1, getResult2.getSeeds());
        assertEquals(PitType.HOUSE, getResult2.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult2.getOwner());
        assertEquals(1, getResult2.getOppositeId());
        PitEntity getResult3 = actualCreateResult.get(4);
        assertEquals(1, getResult3.getSeeds());
        assertEquals(PitType.HOUSE, getResult3.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult3.getOwner());
        assertEquals(8, getResult3.getOppositeId());
        PitEntity getResult4 = actualCreateResult.get(10);
        assertEquals(1, getResult4.getSeeds());
        assertEquals(PitType.HOUSE, getResult4.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult4.getOwner());
        assertEquals(2, getResult4.getOppositeId());
        PitEntity getResult5 = actualCreateResult.get(9);
        assertEquals(1, getResult5.getSeeds());
        assertEquals(PitType.HOUSE, getResult5.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult5.getOwner());
        assertEquals(3, getResult5.getOppositeId());
        PitEntity getResult6 = actualCreateResult.get(3);
        assertEquals(1, getResult6.getSeeds());
        assertEquals(PitType.HOUSE, getResult6.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult6.getOwner());
        assertEquals(9, getResult6.getOppositeId());
        PitEntity getResult7 = actualCreateResult.get(1);
        assertEquals(1, getResult7.getSeeds());
        assertEquals(PitType.HOUSE, getResult7.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult7.getOwner());
        assertEquals(11, getResult7.getOppositeId());
        PitEntity getResult8 = actualCreateResult.get(13);
        assertEquals(0, getResult8.getSeeds());
        assertEquals(PitType.STORE, getResult8.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult8.getOwner());
        assertEquals(-1, getResult8.getOppositeId());
        PitEntity getResult9 = actualCreateResult.get(0);
        assertEquals(1, getResult9.getSeeds());
        assertEquals(PitType.HOUSE, getResult9.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult9.getOwner());
        assertEquals(12, getResult9.getOppositeId());
        assertEquals(PitType.HOUSE, getResult.getPitType());
    }

    /**
     * Method under test: {@link BoardServiceImpl#newBoard()}
     */
    @Test
    void testNewBoard() {
        List<PitEntity> actualNewBoardResult = boardServiceImpl.newBoard();
        assertEquals(14, actualNewBoardResult.size());
        PitEntity getResult = actualNewBoardResult.get(2);
        assertEquals(PlayerTurn.FIRST, getResult.getOwner());
        assertEquals(10, getResult.getOppositeId());
        PitEntity getResult1 = actualNewBoardResult.get(12);
        assertEquals(1, getResult1.getSeeds());
        assertEquals(PitType.HOUSE, getResult1.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult1.getOwner());
        assertEquals(0, getResult1.getOppositeId());
        PitEntity getResult2 = actualNewBoardResult.get(11);
        assertEquals(1, getResult2.getSeeds());
        assertEquals(PitType.HOUSE, getResult2.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult2.getOwner());
        assertEquals(1, getResult2.getOppositeId());
        PitEntity getResult3 = actualNewBoardResult.get(4);
        assertEquals(1, getResult3.getSeeds());
        assertEquals(PitType.HOUSE, getResult3.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult3.getOwner());
        assertEquals(8, getResult3.getOppositeId());
        PitEntity getResult4 = actualNewBoardResult.get(10);
        assertEquals(1, getResult4.getSeeds());
        assertEquals(PitType.HOUSE, getResult4.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult4.getOwner());
        assertEquals(2, getResult4.getOppositeId());
        PitEntity getResult5 = actualNewBoardResult.get(9);
        assertEquals(1, getResult5.getSeeds());
        assertEquals(PitType.HOUSE, getResult5.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult5.getOwner());
        assertEquals(3, getResult5.getOppositeId());
        PitEntity getResult6 = actualNewBoardResult.get(3);
        assertEquals(1, getResult6.getSeeds());
        assertEquals(PitType.HOUSE, getResult6.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult6.getOwner());
        assertEquals(9, getResult6.getOppositeId());
        PitEntity getResult7 = actualNewBoardResult.get(1);
        assertEquals(1, getResult7.getSeeds());
        assertEquals(PitType.HOUSE, getResult7.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult7.getOwner());
        assertEquals(11, getResult7.getOppositeId());
        PitEntity getResult8 = actualNewBoardResult.get(13);
        assertEquals(0, getResult8.getSeeds());
        assertEquals(PitType.STORE, getResult8.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult8.getOwner());
        assertEquals(-1, getResult8.getOppositeId());
        PitEntity getResult9 = actualNewBoardResult.get(0);
        assertEquals(1, getResult9.getSeeds());
        assertEquals(PitType.HOUSE, getResult9.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult9.getOwner());
        assertEquals(12, getResult9.getOppositeId());
        assertEquals(PitType.HOUSE, getResult.getPitType());
    }

    /**
     * Method under test: {@link BoardServiceImpl#playerHouses(PlayerTurn)}
     */
    @Test
    void testPlayerHouses() {
        List<PitEntity> actualPlayerHousesResult = boardServiceImpl.playerHouses(PlayerTurn.FIRST);
        assertEquals(7, actualPlayerHousesResult.size());
        PitEntity getResult = actualPlayerHousesResult.get(2);
        assertFalse(getResult.isEmpty());
        PitEntity getResult1 = actualPlayerHousesResult.get(5);
        assertFalse(getResult1.isEmpty());
        assertEquals(PitType.HOUSE, getResult1.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult1.getOwner());
        assertEquals(7, getResult1.getOppositeId());
        assertEquals(PitType.HOUSE, getResult.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult.getOwner());
        assertEquals(10, getResult.getOppositeId());
        PitEntity getResult2 = actualPlayerHousesResult.get(4);
        assertEquals(1, getResult2.getSeeds());
        assertEquals(PitType.HOUSE, getResult2.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult2.getOwner());
        assertEquals(8, getResult2.getOppositeId());
        PitEntity getResult3 = actualPlayerHousesResult.get(3);
        assertEquals(1, getResult3.getSeeds());
        assertEquals(PitType.HOUSE, getResult3.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult3.getOwner());
        assertEquals(9, getResult3.getOppositeId());
        PitEntity getResult4 = actualPlayerHousesResult.get(1);
        assertEquals(1, getResult4.getSeeds());
        assertEquals(PitType.HOUSE, getResult4.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult4.getOwner());
        assertEquals(11, getResult4.getOppositeId());
        PitEntity getResult5 = actualPlayerHousesResult.get(6);
        assertEquals(0, getResult5.getSeeds());
        assertEquals(PitType.STORE, getResult5.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult5.getOwner());
        assertEquals(-1, getResult5.getOppositeId());
        PitEntity getResult6 = actualPlayerHousesResult.get(0);
        assertEquals(1, getResult6.getSeeds());
        assertEquals(PitType.HOUSE, getResult6.getPitType());
        assertEquals(PlayerTurn.FIRST, getResult6.getOwner());
        assertEquals(12, getResult6.getOppositeId());
    }

    /**
     * Method under test: {@link BoardServiceImpl#playerHouses(PlayerTurn)}
     */
    @Test
    void testPlayerHouses2() {
        List<PitEntity> actualPlayerHousesResult = boardServiceImpl.playerHouses(PlayerTurn.SECOND);
        assertEquals(7, actualPlayerHousesResult.size());
        PitEntity getResult = actualPlayerHousesResult.get(2);
        assertFalse(getResult.isEmpty());
        PitEntity getResult1 = actualPlayerHousesResult.get(5);
        assertFalse(getResult1.isEmpty());
        assertEquals(PitType.HOUSE, getResult1.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult1.getOwner());
        assertEquals(0, getResult1.getOppositeId());
        assertEquals(PitType.HOUSE, getResult.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult.getOwner());
        assertEquals(3, getResult.getOppositeId());
        PitEntity getResult2 = actualPlayerHousesResult.get(4);
        assertEquals(1, getResult2.getSeeds());
        assertEquals(PitType.HOUSE, getResult2.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult2.getOwner());
        assertEquals(1, getResult2.getOppositeId());
        PitEntity getResult3 = actualPlayerHousesResult.get(3);
        assertEquals(1, getResult3.getSeeds());
        assertEquals(PitType.HOUSE, getResult3.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult3.getOwner());
        assertEquals(2, getResult3.getOppositeId());
        PitEntity getResult4 = actualPlayerHousesResult.get(1);
        assertEquals(1, getResult4.getSeeds());
        assertEquals(PitType.HOUSE, getResult4.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult4.getOwner());
        assertEquals(4, getResult4.getOppositeId());
        PitEntity getResult5 = actualPlayerHousesResult.get(6);
        assertEquals(0, getResult5.getSeeds());
        assertEquals(PitType.STORE, getResult5.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult5.getOwner());
        assertEquals(-1, getResult5.getOppositeId());
        PitEntity getResult6 = actualPlayerHousesResult.get(0);
        assertEquals(1, getResult6.getSeeds());
        assertEquals(PitType.HOUSE, getResult6.getPitType());
        assertEquals(PlayerTurn.SECOND, getResult6.getOwner());
        assertEquals(5, getResult6.getOppositeId());
    }

    /**
     * Method under test: {@link BoardServiceImpl#calculateOppositeId(int, PlayerTurn)}
     */
    @Test
    void testCalculateOppositeId() {
        assertEquals(11, boardServiceImpl.calculateOppositeId(1, PlayerTurn.FIRST));
        assertEquals(4, boardServiceImpl.calculateOppositeId(1, PlayerTurn.SECOND));
    }

}