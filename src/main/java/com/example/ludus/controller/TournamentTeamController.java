package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.TournamentTeamDao;
import com.example.ludus.entity.TournamentTeam;
import com.example.ludus.repository.TournamentTeamRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.TOURNAMENT_TEAM_API)
public class TournamentTeamController extends BaseController<TournamentTeam, TournamentTeamDao, TournamentTeamRepository> {
    public TournamentTeamController(TournamentTeamRepository repository) {
        super(repository);
    }
}
