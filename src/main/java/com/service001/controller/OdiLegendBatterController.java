package com.service001.controller;

import com.service001.service.OdiLegendBatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdiLegendBatterController {
    @Autowired
    OdiLegendBatterService odiLegendBatterService;
}
