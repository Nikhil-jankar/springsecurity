package com.Task2.springsecurity.repository;

import com.Task2.springsecurity.entities.Role;
import com.Task2.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {


        Optional<User> findByEmail(String email);

        User findByRole(Role role);
}
