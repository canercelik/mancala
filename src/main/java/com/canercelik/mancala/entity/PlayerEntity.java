package com.canercelik.mancala.entity;

import com.canercelik.mancala.enums.PlayerTurn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerEntity {

    private UUID uuid;

    private String playerName;

    private PlayerTurn order;


}
