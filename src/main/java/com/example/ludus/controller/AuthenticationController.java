package com.example.ludus.controller;

import com.example.ludus.Constants;
import com.example.ludus.config.JWTUtil;
import com.example.ludus.request.AuthenticationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.AUTH_API)
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final JWTUtil jwtTokenUtil;

    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public String createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) {
        Authentication authentication;
        try {
            authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getLogin(), authenticationRequest.getPassword()));
            System.out.println(authentication);
        } catch (BadCredentialsException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Имя или пароль неправильны", e);
        }
        // при создании токена в него кладется username как Subject claim и список authorities как кастомный claim
        return jwtTokenUtil.generateToken((UserDetails) authentication.getPrincipal());
    }
}
