package cn.itcast.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author : huajuan
 * create at : 2019-10-16 00:06
 * description :
 * remark : 配置类
 * @program: hm49
 **/
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    @Autowired
    private JdbcProperties jdbcProperties;


    /**
     * 把方法的返回值注入到spring容器
     * @return
     */
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }
}
