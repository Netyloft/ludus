package com.example.ludus.repository;

import com.example.ludus.dao.TeamDao;
import com.example.ludus.entity.Team;
import org.springframework.stereotype.Repository;

@Repository
public class TeamRepository extends BaseRepository<Team, TeamDao> {
    public TeamRepository(TeamDao dao) {
        super(dao);
    }
}
