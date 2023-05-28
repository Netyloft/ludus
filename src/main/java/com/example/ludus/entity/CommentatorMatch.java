package com.example.ludus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "commentator_match")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentatorMatch extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player commentator;

    @ManyToOne
//    @JoinColumn(name = "match_id")
    private Match tournament;

}
