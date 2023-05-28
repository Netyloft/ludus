package com.example.ludus.repository;

import com.example.ludus.dao.PlayerDao;
import com.example.ludus.entity.Player;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerRepository extends BaseRepository<Player, PlayerDao> {
    public PlayerRepository(PlayerDao dao) {
        super(dao);
    }
}
