package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.example.domain.User;
/**
 * Created by hoyounglee on 2016. 8. 14..
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
