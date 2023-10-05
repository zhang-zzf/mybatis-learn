package com.github.zzf.service;

import com.github.zzf.dao.UserDao;
import com.github.zzf.dao.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public User getById(Long userId) {
        return userDao.getBy(userId);
    }

}
