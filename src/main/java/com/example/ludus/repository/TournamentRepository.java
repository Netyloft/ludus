package com.example.ludus.repository;

import com.example.ludus.dao.TournamentDao;
import com.example.ludus.entity.Tournament;
import org.springframework.stereotype.Repository;

@Repository
public class TournamentRepository extends BaseRepository<Tournament, TournamentDao> {
    public TournamentRepository(TournamentDao dao) {
        super(dao);
    }
}
