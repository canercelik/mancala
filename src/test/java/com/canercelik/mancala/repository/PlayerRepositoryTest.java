package com.canercelik.mancala.repository;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.canercelik.mancala.entity.PlayerEntity;

import java.util.UUID;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PlayerRepository.class})
@ExtendWith(SpringExtension.class)
class PlayerRepositoryTest {

    @Autowired
    private PlayerRepository playerRepository;

    /**
     * Method under test: {@link PlayerRepository#save(PlayerEntity)}
     */
    @Test
    void testSave() {
        PlayerEntity playerEntity = new PlayerEntity();
        assertSame(playerEntity, playerRepository.save(playerEntity));
    }

    /**
     * Method under test: {@link PlayerRepository#save(PlayerEntity)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSave2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.canercelik.mancala.entity.PlayerEntity.getUuid()" because "playerEntity" is null
        //       at com.canercelik.mancala.repository.PlayerRepository.save(PlayerRepository.java:15)
        //   In order to prevent save(PlayerEntity)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   save(PlayerEntity).
        //   See https://diff.blue/R013 to resolve this issue.

        playerRepository.save(null);
    }

    /**
     * Method under test: {@link PlayerRepository#save(PlayerEntity)}
     */
    @Test
    void testSave3() {
        PlayerEntity playerEntity = mock(PlayerEntity.class);
        when(playerEntity.getUuid()).thenReturn(UUID.randomUUID());
        playerRepository.save(playerEntity);
        verify(playerEntity).getUuid();
    }

    /**
     * Method under test: {@link PlayerRepository#findById(UUID)}
     */
    @Test
    void testFindById() {
        assertNull(playerRepository.findById(UUID.randomUUID()));
    }

}
