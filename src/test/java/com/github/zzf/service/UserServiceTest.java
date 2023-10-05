package com.github.zzf.service;

import com.github.zzf.Application;
import com.github.zzf.dao.model.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;

@Ignore
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {Application.class})
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void getById() {
        User user = userService.getById(1L);
        then(user).returns(1L, User::getId);
    }

}