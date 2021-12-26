package com.service001.repository;

import com.service001.model.OdiTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdiTeamRepository extends JpaRepository<OdiTeam, Long> {
}
