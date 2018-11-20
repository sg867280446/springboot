package com.hjl.demo.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(name = "user")
    public User initUser(){
        User user = new User();
        user.setName("hjl");
        return user;
    }





}
