package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.service.PitService;

public class PitServiceImpl implements PitService {

    @Override
    public PitEntity sow(PitEntity pitEntity) {
        return PitEntity.builder()
                .pitType(pitEntity.getPitType())
                .oppositeId(pitEntity.getOppositeId())
                .seeds(pitEntity.getSeeds()+1)
                .owner(pitEntity.getOwner())
                .build();
    }

    @Override
    public PitEntity sow(PitEntity pitEntity, int seeds) {
        return  PitEntity.builder()
                .pitType(pitEntity.getPitType())
                .oppositeId(pitEntity.getOppositeId())
                .seeds(pitEntity.getSeeds()+seeds)
                .owner(pitEntity.getOwner())
                .build();

    }
}
