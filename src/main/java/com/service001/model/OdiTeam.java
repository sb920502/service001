package com.service001.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "odi_team", schema = "service001")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OdiTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "team_name", unique = true)
    private String teamName;

    @Column(name = "position")
    private int position;

    @Column(name = "rating")
    private int rating;

    @Column(name = "points")
    private int points;

    @OneToMany(mappedBy = "odiTeam")
    private List<OdiLegendBatter> odiLegendBatterList = new ArrayList<>();
}
