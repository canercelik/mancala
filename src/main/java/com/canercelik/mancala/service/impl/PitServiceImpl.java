package com.canercelik.mancala.service.impl;

import com.canercelik.mancala.entity.pit.PitEntity;
import com.canercelik.mancala.service.PitService;
import org.springframework.stereotype.Service;

/**
 * PitServiceImpl is a service class that implements the PitService interface.
 * It provides methods to sow seeds in a pit.
 */
@Service
public class PitServiceImpl implements PitService {

    /**
     * Sows one seed in the given pit.
     *
     * @param pitEntity The pit in which to sow the seed.
     * @return A new PitEntity with the updated number of seeds.
     */
    @Override
    public PitEntity sow(PitEntity pitEntity) {
        return PitEntity.builder()
                .pitType(pitEntity.getPitType())
                .oppositeId(pitEntity.getOppositeId())
                .seeds(pitEntity.getSeeds()+1)
                .owner(pitEntity.getOwner())
                .build();
    }

    /**
     * Sows a specified number of seeds in the given pit.
     *
     * @param pitEntity The pit in which to sow the seeds.
     * @param seeds The number of seeds to sow.
     * @return A new PitEntity with the updated number of seeds.
     */
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