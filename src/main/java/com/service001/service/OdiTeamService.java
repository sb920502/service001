package com.service001.service;

import com.service001.model.OdiTeam;
import com.service001.repository.OdiTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdiTeamService {
    @Autowired
    OdiTeamRepository odiTeamRepository;

    public List<OdiTeam> getAllOdiTeams() {
        return odiTeamRepository.findAll();
    }
}
