package com.cn.sb_rest_h2.services.resth2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.cn.sb_rest_h2.services")
@EntityScan("com.cn.sb_rest_h2.services.resth2service.model")
@EnableJpaRepositories("com.cn.sb_rest_h2.services.resth2service.dao")
public class Launcher
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(Launcher.class, args);
    }
}
