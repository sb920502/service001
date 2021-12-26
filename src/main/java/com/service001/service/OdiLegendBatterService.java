package com.service001.service;

import com.service001.repository.OdiLegendBatterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OdiLegendBatterService {
    @Autowired
    OdiLegendBatterRepository odiLegendBatterRepository;
}
