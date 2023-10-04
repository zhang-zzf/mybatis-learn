package com.github.zzf.dao;


import com.github.zzf.dao.model.UserDetail;

/**
 * @author zhanfeng.zhang
 * @date 2019/10/18
 */
public interface UserDetailDao {

    UserDetail getBy(long userId);

    int insert(UserDetail userDetail);

}
