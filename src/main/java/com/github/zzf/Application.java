package com.github.zzf;

import com.github.zzf.dao.UserDao;
import com.github.zzf.dao.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author zhang.zzf
 * @date 2020-04-18
 */
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("Hello,World");
        InputStream r = ClassLoader.getSystemResourceAsStream("mybatis-global-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(r);
        try (SqlSession sqlSession = sessionFactory.openSession()) {
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            User user = userDao.getBy(1L);
            log.info("user -> {}", user);
        }
    }

}
