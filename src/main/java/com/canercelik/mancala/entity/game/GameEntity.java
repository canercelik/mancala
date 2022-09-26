package com.canercelik.mancala.entity.game;

import com.canercelik.mancala.entity.PlayerEntity;
import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.enums.GameStatus;
import com.canercelik.mancala.enums.PlayerTurn;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class GameEntity {
    @JsonProperty(value = "uuid")
    private UUID uuid;
    @JsonProperty(value = "firstPlayerEntity")
    private PlayerEntity firstPlayerEntity;
    @JsonProperty(value = "secondPlayerEntity")
    private PlayerEntity secondPlayerEntity;
    @JsonProperty(value = "board")
    private List<PitEntity> board;
    @JsonProperty(value = "status")
    private GameStatus status;
    @JsonProperty(value = "totalTurn")
    private int totalTurn;
    @JsonProperty(value = "playerTurn")
    private PlayerTurn playerTurn;

}