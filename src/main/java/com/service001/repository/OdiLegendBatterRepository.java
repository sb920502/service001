package com.service001.repository;

import com.service001.model.OdiLegendBatter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdiLegendBatterRepository extends JpaRepository<OdiLegendBatter, Long> {
}
