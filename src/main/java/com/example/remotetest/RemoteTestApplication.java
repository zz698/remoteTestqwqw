package com.example.remotetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class RemoteTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RemoteTestApplication.class, args);
    }

}
