package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.spring.rest.repository")
public class UserApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserApp.class, args);
    }
}
