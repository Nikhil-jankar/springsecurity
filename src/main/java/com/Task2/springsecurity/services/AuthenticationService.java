package com.Task2.springsecurity.services;

import com.Task2.springsecurity.dto.SignUpRequest;
import com.Task2.springsecurity.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);
}
