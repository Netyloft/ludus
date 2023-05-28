package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.TeamPlayerDao;
import com.example.ludus.entity.TeamPlayer;
import com.example.ludus.repository.TeamPlayerRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.TEAM_PLAYER_API)
public class TeamPlayerController extends BaseController<TeamPlayer, TeamPlayerDao, TeamPlayerRepository> {
    public TeamPlayerController(TeamPlayerRepository repository) {
        super(repository);
    }
}
