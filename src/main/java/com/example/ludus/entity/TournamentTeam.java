package com.example.ludus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tournament_team")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TournamentTeam extends BaseEntity{

    @ManyToOne
//    @JoinColumn(name = "player_id")
    private Tournament tournament;

    @ManyToOne
//    @JoinColumn(name = "match_id")
    private Team team;

}
