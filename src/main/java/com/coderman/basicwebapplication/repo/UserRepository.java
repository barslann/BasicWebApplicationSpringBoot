package com.coderman.basicwebapplication.repo;

import com.coderman.basicwebapplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}