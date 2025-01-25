package com.Task2.springsecurity.services.impl;

import com.Task2.springsecurity.dto.SignUpRequest;
import com.Task2.springsecurity.entities.Role;
import com.Task2.springsecurity.entities.User;
import com.Task2.springsecurity.repository.UserRepository;
import com.Task2.springsecurity.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

     private final UserRepository userRepository;
     private final PasswordEncoder passwordEncoder;


    public User signUp(SignUpRequest signUpRequest) {
        User user = new User();

        user.setEmail(signUpRequest.getEmail());
        user.setFirstname(signUpRequest.getFirstName());
        user.setSecondname(signUpRequest.getLastName());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

        return userRepository.save(user);
    }

    @Override
    public User signup(SignUpRequest signUpRequest) {
        return null;
    }
}
