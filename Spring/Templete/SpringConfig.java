package com.core.Templete;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

    @Bean
    public DriverManagerDataSource dataSource() {

        DriverManagerDataSource ds =
                new DriverManagerDataSource();

        ds.setDriverClassName(
                "com.mysql.cj.jdbc.Driver");

        ds.setUrl(
                "jdbc:mysql://localhost:3306/softra_j2ee");

        ds.setUsername("root");

        ds.setPassword("2550");

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {

        JdbcTemplate jt =
                new JdbcTemplate();

        jt.setDataSource(dataSource());

        return jt;
    }

    @Bean
    public Dao dao() {

        PersonImpl p =
                new PersonImpl();

        p.setJdbcTemplate(jdbcTemplate());

        return p;
    }
}