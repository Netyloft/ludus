package com.example.ludus.repository;

import com.example.ludus.dao.CommentatorMatchDao;
import com.example.ludus.entity.CommentatorMatch;
import org.springframework.stereotype.Repository;

@Repository
public class CommentatorMatchRepository extends BaseRepository<CommentatorMatch, CommentatorMatchDao> {
    public CommentatorMatchRepository(CommentatorMatchDao dao) {
        super(dao);
    }
}
