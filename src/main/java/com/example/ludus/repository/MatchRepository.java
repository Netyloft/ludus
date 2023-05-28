package com.example.ludus.repository;

import com.example.ludus.dao.MatchDao;
import com.example.ludus.entity.Match;
import org.springframework.stereotype.Repository;

@Repository
public class MatchRepository extends BaseRepository<Match, MatchDao> {
    public MatchRepository(MatchDao dao) {
        super(dao);
    }
}
