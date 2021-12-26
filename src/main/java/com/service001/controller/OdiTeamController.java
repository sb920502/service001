package com.service001.controller;

import com.service001.model.OdiTeam;
import com.service001.service.OdiTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OdiTeamController {
    @Autowired
    OdiTeamService odiTeamService;

    @RequestMapping(method = RequestMethod.GET, value = "odiTeam/list/v1")
    public List<OdiTeam> getAllOdiTeams() {
        return odiTeamService.getAllOdiTeams();
    }
}
