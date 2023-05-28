package com.example.ludus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "match")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Match extends BaseEntity {

    @ManyToOne
//    @JoinColumn(name = "first_team_id")
    private Team firsTeam;
    @ManyToOne
//    @JoinColumn(name = "second_team_id")
    private Team secondTeam;
    private Timestamp startTime;
    private Integer scoreFirstTeam;
    private Integer scoreSecondTeam;
    private Boolean isOnline;
    @ManyToOne
//    @JoinColumn(name = "tournament_id")
    private Tournament tournament;

}
