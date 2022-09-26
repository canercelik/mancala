package com.canercelik.mancala.service;

import com.canercelik.mancala.entity.pit.PitEntity;

public interface PitService {

    PitEntity sow(PitEntity pitEntity);
    PitEntity sow(PitEntity pitEntity, int seeds);
}
