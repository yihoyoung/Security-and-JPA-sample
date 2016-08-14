package com.example.service;

import com.example.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by hoyounglee on 2016. 8. 14..
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserByUsername(){
        String username = "admin";

        User user = userService.getUserByUsername(username);
        System.out.println(user);
        assertThat(user.getPassword()).isEqualTo("admin");
    }
}
