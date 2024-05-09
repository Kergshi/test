package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApplication.class, args);
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLazyInitialization(true);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
