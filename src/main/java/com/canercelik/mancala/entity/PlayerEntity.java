package com.canercelik.mancala.entity;

import com.canercelik.mancala.enums.PlayerTurn;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PlayerEntity {

    private UUID uuid;

    private String playerName;

    private PlayerTurn order;


}
