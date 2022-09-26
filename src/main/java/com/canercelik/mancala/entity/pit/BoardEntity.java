package com.canercelik.mancala.entity.pit;

import com.canercelik.mancala.entity.pit.PitEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {

   private List<PitEntity> board;

}