package com.service001.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "odi_legend_batter", schema = "service001")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OdiLegendBatter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "batter_name", unique = true)
    private String batterName;

    @Column(name = "matches")
    private int matches;

    @Column(name = "fifties")
    private int fifties;

    @Column(name = "hundreds")
    private int hundreds;

    @Column(name = "avg")
    private BigDecimal avg;

    @Transient
    private Long odiTeamId;

    public Long getOdiTeamId() {
        return odiTeam.getId();
    }

    @Transient
    private String odiTeamName;

    public String getOdiTeamName() {
        return odiTeam.getTeamName();
    }

    @ManyToOne
    @JoinColumn(name = "odi_team_id")
    @JsonIgnore
    private OdiTeam odiTeam;
}
