package com.canercelik.mancala.entity.pit;

import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PitEntity {

    private int seeds;
    private PlayerTurn owner;
    private int oppositeId;
    private PitType pitType;

    public int count() {
        return seeds;
    }

    public boolean isEmpty() {
        return this.seeds == 0;
    }

    public boolean isSowable(PlayerTurn playerTurn){
        if(this.pitType == PitType.STORE)
            return playerTurn == this.owner;
        else
            return true;
    }

    public int take() {
        if(pitType == PitType.HOUSE) {
            int seeds = this.seeds;
            this.seeds = 0;
            return seeds;
        }
        else
            return 0;
    }
}
