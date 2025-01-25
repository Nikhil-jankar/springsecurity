package com.Task2.springsecurity.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService {

    UserDetailsService userDetailsService();

    UserDetailsService getUserDetailsService();

    UserDetails loadUserByUsername(String userEmail);
}