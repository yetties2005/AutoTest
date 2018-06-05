package com.sourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Arthur
 * Date: 2018-06-04
 * Time: 下午3:08
 */
@EnableScheduling
@SpringBootApplication
public class Application {
    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application.context = SpringApplication.run(Application.class, args);
    }


    @PreDestroy
    public void close() {
        Application.context.close();
    }
}