package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.enums.PlayerTurn;
import com.canercelik.mancala.repository.PlayerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {PlayerServiceImpl.class})
@ExtendWith(SpringExtension.class)
class PlayerServiceImplTest {

    @MockBean
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerServiceImpl playerServiceImpl;

    /**
     * Method under test: {@link PlayerServiceImpl#create(String, PlayerTurn)}
     */
    @Test
    void testCreate() {
        PlayerEntity playerEntity = new PlayerEntity();
        when(playerRepository.save((PlayerEntity) any())).thenReturn(playerEntity);
        assertSame(playerEntity, playerServiceImpl.create("Player Name", PlayerTurn.FIRST));
        verify(playerRepository).save((PlayerEntity) any());
    }

    /**
     * Method under test: {@link PlayerServiceImpl#create(String, PlayerTurn)}
     */
    @Test
    void testCreate2() {
        PlayerEntity playerEntity = new PlayerEntity();
        when(playerRepository.save((PlayerEntity) any())).thenReturn(playerEntity);
        assertSame(playerEntity, playerServiceImpl.create("Player Name", PlayerTurn.SECOND));
        verify(playerRepository).save((PlayerEntity) any());
    }
}
