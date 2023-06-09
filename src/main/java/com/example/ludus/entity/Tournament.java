package com.example.ludus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tournament")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tournament extends BaseEntity{
    private String name;
}
