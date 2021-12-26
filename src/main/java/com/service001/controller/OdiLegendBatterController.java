package com.service001.controller;

import com.service001.model.OdiLegendBatter;
import com.service001.service.OdiLegendBatterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OdiLegendBatterController {
    @Autowired
    OdiLegendBatterService odiLegendBatterService;

    @RequestMapping(method = RequestMethod.GET, value = "/odiLegendBatter/list/v1")
    public List<OdiLegendBatter> getAllOdiLegendBatters() {
        return odiLegendBatterService.getAllOdiLegendBatters();
    }
}
