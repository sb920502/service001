package com.service001.service;

import com.service001.model.OdiLegendBatter;
import com.service001.model.OdiTeam;
import com.service001.repository.OdiLegendBatterRepository;
import com.service001.requestDTO.OdiLegendBatterRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class OdiLegendBatterService {
    @Autowired
    OdiLegendBatterRepository odiLegendBatterRepository;

    @Autowired
    OdiTeamService odiTeamService;

    public List<OdiLegendBatter> getAllOdiLegendBatters() {
        return odiLegendBatterRepository.findAll();
    }

    public OdiLegendBatter createOdiLegendBatter(OdiLegendBatterRequestDTO request) {
        String batterName = request.getBatterName();
        int matches = request.getMatches();
        int fifties = request.getFifties();
        int hundreds = request.getHundreds();
        BigDecimal avg = request.getAvg();
        Long odiTeamId = request.getOdiTeamId();

        OdiLegendBatter odiLegendBatter = new OdiLegendBatter();

        odiLegendBatter.setBatterName(batterName);
        odiLegendBatter.setMatches(matches);
        odiLegendBatter.setFifties(fifties);
        odiLegendBatter.setHundreds(hundreds);
        odiLegendBatter.setAvg(avg);

        Optional<OdiTeam> odiTeam = odiTeamService.getOdiTeamById(odiTeamId);
        odiLegendBatter.setOdiTeam(odiTeam.get());

        // odiLegendBatter.setOdiTeam(odiTeam.orElse(null));
        // Optional<OdiTeam> odiTeam = Optional.ofNullable(odiTeamService.getOdiTeamById(odiTeamId).orElseThrow(() -> new EntityNotFoundException(String.valueOf(odiTeamId))));
        // odiLegendBatter.setOdiTeam(odiTeam.get());

        odiLegendBatterRepository.save(odiLegendBatter);

        return odiLegendBatter;
    }
}
