package com.example.ludus.repository;

import com.example.ludus.dao.TeamPlayerDao;
import com.example.ludus.entity.TeamPlayer;
import org.springframework.stereotype.Repository;

@Repository
public class TeamPlayerRepository extends BaseRepository<TeamPlayer, TeamPlayerDao> {
    public TeamPlayerRepository(TeamPlayerDao dao) {
        super(dao);
    }
}
