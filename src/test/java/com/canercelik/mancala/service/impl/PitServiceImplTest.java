package com.canercelik.mancala.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PitServiceImplTest {

    /**
     * Method under test: {@link PitServiceImpl#sow(PitEntity)}
     */
    @Test
    void testSow() {
        PitServiceImpl pitServiceImpl = new PitServiceImpl();
        PitEntity actualSowResult = pitServiceImpl.sow(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE));
        assertEquals(123, actualSowResult.getOppositeId());
        assertFalse(actualSowResult.isEmpty());
        assertEquals(PitType.HOUSE, actualSowResult.getPitType());
        assertEquals(PlayerTurn.FIRST, actualSowResult.getOwner());
    }

    /**
     * Method under test: {@link PitServiceImpl#sow(PitEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSow2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.getPitType()" because "pitEntity" is null
        //       at com.canercelik.mancala.service.impl.PitServiceImpl.sow(PitServiceImpl.java:11)
        //   In order to prevent sow(PitEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sow(PitEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        (new PitServiceImpl()).sow(null);
    }

    /**
     * Method under test: {@link PitServiceImpl#sow(PitEntity, int)}
     */
    @Test
    void testSow3() {
        PitServiceImpl pitServiceImpl = new PitServiceImpl();
        PitEntity actualSowResult = pitServiceImpl.sow(new PitEntity(42, PlayerTurn.FIRST, 123, PitType.HOUSE), 42);
        assertEquals(123, actualSowResult.getOppositeId());
        assertFalse(actualSowResult.isEmpty());
        assertEquals(PitType.HOUSE, actualSowResult.getPitType());
        assertEquals(PlayerTurn.FIRST, actualSowResult.getOwner());
    }

    /**
     * Method under test: {@link PitServiceImpl#sow(PitEntity, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSow4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.pit.PitEntity.getPitType()" because "pitEntity" is null
        //       at com.canercelik.mancala.service.impl.PitServiceImpl.sow(PitServiceImpl.java:21)
        //   In order to prevent sow(PitEntity, int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   sow(PitEntity, int).
        //   See https://diff.blue/R013 to resolve this issue.

        (new PitServiceImpl()).sow(null, 42);
    }
}