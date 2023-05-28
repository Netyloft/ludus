package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.TournamentDao;
import com.example.ludus.entity.Tournament;
import com.example.ludus.repository.TournamentRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.TOURNAMENT_API)
public class TournamentController extends BaseController<Tournament, TournamentDao, TournamentRepository> {
    public TournamentController(TournamentRepository repository) {
        super(repository);
    }
}
