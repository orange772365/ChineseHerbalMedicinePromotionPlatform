package com.herb.plant.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@SpringBootApplication
public class CommunityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityServerApplication.class, args);
    }

}
