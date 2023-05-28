package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.dao.PlayerDao;
import com.example.ludus.domen.Role;
import com.example.ludus.entity.Player;
import com.example.ludus.repository.PlayerRepository;
import io.swagger.annotations.Api;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "Тестовый контроллер")
@RequestMapping(Constants.PLAYER_API)
public class PlayerController extends BaseController<Player, PlayerDao, PlayerRepository> {

    private final PasswordEncoder passwordEncoder;

    public PlayerController(PlayerRepository repository, PasswordEncoder passwordEncoder) {
        super(repository);
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/create")
    public Player create(@RequestBody Player entity) {
        String password = entity.getPassword();
        entity.setPassword(passwordEncoder.encode(password));
        if(entity.getRole() == null)
            entity.setRole(Role.USER);
        return repository.create(entity);
    }
}
