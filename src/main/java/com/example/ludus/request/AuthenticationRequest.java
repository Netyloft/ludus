package com.example.ludus.request;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String login;
    private String password;
}
