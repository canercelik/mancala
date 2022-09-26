package com.canercelik.mancala.entity.pit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PitEntityTest {
    PitEntity pitEntity = new PitEntity(0, PlayerTurn.FIRST, 0, PitType.HOUSE);

    @Test
    void testCount() {
        int result = pitEntity.count();
        Assertions.assertEquals(0, result);
    }

    /**
     * Method under test: {@link PitEntity#count()}
     */
    @Test
    void testCount2() {
        assertEquals(42, (new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE)).count());
    }

    @Test
    void testIsEmpty() {
        boolean result = pitEntity.isEmpty();
        Assertions.assertEquals(true, result);
    }

    /**
     * Method under test: {@link PitEntity#isEmpty()}
     */
    @Test
    void testIsEmpty2() {
        assertFalse((new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE)).isEmpty());
    }

    /**
     * Method under test: {@link PitEntity#isEmpty()}
     */
    @Test
    void testIsEmpty3() {
        assertTrue((new PitEntity(0, PlayerTurn.FIRST, 123, PitType.HOUSE)).isEmpty());
    }

    @Test
    void testIsSowable() {
        boolean result = pitEntity.isSowable(PlayerTurn.FIRST);
        Assertions.assertEquals(true, result);
    }

    /**
     * Method under test: {@link PitEntity#isSowable(PlayerTurn)}
     */
    @Test
    void testIsSowable2() {
        assertTrue((new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE)).isSowable(PlayerTurn.FIRST));
    }

    /**
     * Method under test: {@link PitEntity#isSowable(PlayerTurn)}
     */
    @Test
    void testIsSowable3() {
        assertTrue((new PitEntity(42, PlayerTurn.FIRST, 123, PitType.STORE)).isSowable(PlayerTurn.FIRST));
    }

    /**
     * Method under test: {@link PitEntity#isSowable(PlayerTurn)}
     */
    @Test
    void testIsSowable4() {
        assertTrue((new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE)).isSowable(PlayerTurn.SECOND));
    }

    /**
     * Method under test: {@link PitEntity#isSowable(PlayerTurn)}
     */
    @Test
    void testIsSowable5() {
        assertFalse((new PitEntity(42, PlayerTurn.SECOND, 123, PitType.STORE)).isSowable(PlayerTurn.FIRST));
    }

    @Test
    void testTake() {
        int result = pitEntity.take();
        Assertions.assertEquals(0, result);
    }

    /**
     * Method under test: {@link PitEntity#take()}
     */
    @Test
    void testTake2() {
        PitEntity pitEntity = new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE);
        assertEquals(42, pitEntity.take());
        assertTrue(pitEntity.isEmpty());
    }

    /**
     * Method under test: {@link PitEntity#take()}
     */
    @Test
    void testTake3() {
        assertEquals(0, (new PitEntity(42, PlayerTurn.FIRST, 123, PitType.STORE)).take());
    }

    @Test
    void testSetSeeds() {
        pitEntity.setSeeds(0);
    }

    @Test
    void testSetOwner() {
        pitEntity.setOwner(PlayerTurn.FIRST);
    }

    @Test
    void testSetOppositeId() {
        pitEntity.setOppositeId(0);
    }

    @Test
    void testSetPitType() {
        pitEntity.setPitType(PitType.HOUSE);
    }

    @Test
    void testBuilder() {
        PitEntity.PitEntityBuilder result = PitEntity.builder();
        Assertions.assertEquals(PitEntity.builder(), result);
    }
}
