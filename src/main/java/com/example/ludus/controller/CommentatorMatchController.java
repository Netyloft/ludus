package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.CommentatorMatchDao;
import com.example.ludus.entity.CommentatorMatch;
import com.example.ludus.repository.CommentatorMatchRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.COMMENTATOR_MATCH_API)
public class CommentatorMatchController extends BaseController<CommentatorMatch, CommentatorMatchDao, CommentatorMatchRepository>{
    public CommentatorMatchController(CommentatorMatchRepository repository) {
        super(repository);
    }
}
