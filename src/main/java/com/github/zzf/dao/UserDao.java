package com.github.zzf.dao;


import com.github.zzf.dao.model.User;

/**
 * @author zhanfeng.zhang
 * @date 2019/10/18
 */
public interface UserDao {

    User getBy(long id);

    int insert(User user);

}
