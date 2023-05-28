package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.TeamDao;
import com.example.ludus.entity.Team;
import com.example.ludus.repository.TeamRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.TEAM_API)
public class TeamController extends BaseController<Team, TeamDao, TeamRepository> {
    public TeamController(TeamRepository repository) {
        super(repository);
    }
}
