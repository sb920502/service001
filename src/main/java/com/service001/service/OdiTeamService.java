package com.service001.service;

import com.service001.repository.OdiTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OdiTeamService {
    @Autowired
    OdiTeamRepository odiTeamRepository;
}
