package com.canercelik.mancala.entity.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Builder
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class GameStartEntity {
    @JsonProperty(value = "firstPlayer")
    private String firstPlayer;
    @JsonProperty(value = "secondPlayer")
    private String secondPlayer;
}
