package com.example.ludus.domen;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Role {
    USER,
    ADMIN,
    COMMENTATOR;

    @JsonCreator
    public static Role getByName(String name) {
        return Role.valueOf(name);
    }
}
