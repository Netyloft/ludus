package com.example.ludus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "team_player")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamPlayer extends BaseEntity{

    @ManyToOne
//    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
//    @JoinColumn(name = "match_id")
    private Team team;

}
