package com.canercelik.mancala.enums;

public class GameConfig {

    /**
     * These constants are placed to manage
     * number of pits and number of seeds easily
     * according to the need.
     *
     * Game will be fully adapted to the new number
     * of PITS and SEEDS
     */
    public static int TOTAL_PITS = 14;
    public static int PLAYER_PITS = TOTAL_PITS/2;
    public static int FIRST_PLAYER_STORE_INDEX = (TOTAL_PITS /2)-1;
    public static int SECOND_PLAYER_STORE_INDEX = TOTAL_PITS -1;;
    public final static int SEEDS_PER_PIT = 6;
}
