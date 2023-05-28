package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.MatchDao;
import com.example.ludus.entity.Match;
import com.example.ludus.repository.MatchRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.MATCH_API)
public class MatchController extends BaseController<Match, MatchDao, MatchRepository>{
    public MatchController(MatchRepository repository) {
        super(repository);
    }
}
