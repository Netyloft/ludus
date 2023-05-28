package com.example.ludus.repository;

import com.example.ludus.dao.TournamentTeamDao;
import com.example.ludus.entity.TournamentTeam;
import org.springframework.stereotype.Repository;

@Repository
public class TournamentTeamRepository extends BaseRepository<TournamentTeam, TournamentTeamDao> {
    public TournamentTeamRepository(TournamentTeamDao dao) {
        super(dao);
    }
}
