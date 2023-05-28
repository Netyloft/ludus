package com.example.ludus.entity;

import com.example.ludus.domen.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "player")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player extends BaseEntity {

    private String login;

    private String password;

    private Integer rang;

    @Enumerated(EnumType.STRING)
    private Role role;
}
