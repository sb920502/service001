package com.service001.controller;

import com.service001.service.OdiTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdiTeamController {
    @Autowired
    OdiTeamService odiTeamService;
}
