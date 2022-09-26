package com.canercelik.mancala.entity.game;

import com.canercelik.mancala.enums.PlayerTurn;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamePlayEntity {
    @JsonProperty(value = "uuid")
    private UUID uuid;
    @JsonProperty(value = "playerTurn")
    private PlayerTurn playerTurn;
    @JsonProperty(value = "pitIndex")
    private int pitIndex;

}