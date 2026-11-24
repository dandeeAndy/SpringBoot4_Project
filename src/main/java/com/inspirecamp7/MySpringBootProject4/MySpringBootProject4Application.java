package com.inspirecamp7.MySpringBootProject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

//Configuration + @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication
public class MySpringBootProject4Application {
    @Autowired
    static DataSource dataSource;

	public static void main(String[] args) {
//		SpringApplication.run(MySpringBootProject4Application.class, args);
        SpringApplication application = new SpringApplication(MySpringBootProject4Application.class);
        application.run(args);
    }

    @Bean
    public String helloBean(){
        return new String("hello 스프링부트");
    }
}
