package com.example.ludus.dao;

import com.example.ludus.entity.Player;

public interface PlayerDao extends BaseDao<Player> {
    Player findByLogin(String login);
}
