package com.service001.service;

import com.service001.model.OdiLegendBatter;
import com.service001.repository.OdiLegendBatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdiLegendBatterService {
    @Autowired
    OdiLegendBatterRepository odiLegendBatterRepository;

    public List<OdiLegendBatter> getAllOdiLegendBatters() {
        return odiLegendBatterRepository.findAll();
    }
}
