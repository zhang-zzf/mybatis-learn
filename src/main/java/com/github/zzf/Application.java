package com.github.zzf;

import com.github.zzf.dao.DaoPackage;
import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author zhang.zzf
 */
@Slf4j
@Configuration
@ComponentScan(basePackageClasses = {AppPackage.class})
@MapperScan(basePackageClasses = {DaoPackage.class})
public class Application {

    public static void main(String[] args) throws InterruptedException {
        log.info("Hello,World");
        // 启动 spring 容器
        new AnnotationConfigApplicationContext(Application.class);
        Thread.currentThread().join();
    }

    @Bean
    public DataSource dataSource() {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUrl("jdbc:mysql://ds918:3306/test");
        ds.setUser("root");
        ds.setPassword("test");
        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        return factoryBean.getObject();
    }

}
