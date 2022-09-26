package com.canercelik.mancala.entity.pit;

import com.canercelik.mancala.enums.PitType;
import com.canercelik.mancala.enums.PlayerTurn;
import lombok.*;

import static com.canercelik.mancala.enums.PitType.HOUSE;
import static com.canercelik.mancala.enums.PitType.STORE;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
        if(this.pitType == STORE)
            return playerTurn.equals(this.owner);
        else
            return true;
    }

    public int take() {
        if(pitType == HOUSE) {
            int seeds = this.seeds;
            this.seeds = 0;
            return seeds;
        }
        else
        /**
         * Needed to throw an exception here.
         */
            return 0;
    }

}
