package com.example.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

/**
 * Created by hoyounglee on 2016. 8. 14..
 */
public class SecurityUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public SecurityUser(User user){
        super(user.getUsername(), user.getPassword(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
    }

    public User getUser(){
        return user;
    }

    public Role getRole(){
        return user.getRole();
    }

}
