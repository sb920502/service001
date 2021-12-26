package com.service001.requestDTO;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class OdiLegendBatterRequestDTO {
    private String batterName;
    private int matches;
    private int fifties;
    private int hundreds;
    private BigDecimal avg;
    private Long odiTeamId;
}
