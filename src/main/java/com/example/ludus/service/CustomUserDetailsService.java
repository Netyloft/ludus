package com.example.ludus.service;

import com.example.ludus.dao.PlayerDao;
import com.example.ludus.entity.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final PlayerDao repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Player person = repository.findByLogin(username);
        if (person == null) {
            throw new UsernameNotFoundException("Пользователь с таким логином не найден: " + username);
        }

        return User.builder()//todo
                .username(person.getLogin())
                .password(person.getPassword())
                .roles(person.getRole().name())
                .build();
    }
}
