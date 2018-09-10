package com.ian.practice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * PracticeApplication
 *
 * @author YangJing
 * @date 2018/9/6 11:26
 */
@ComponentScan(basePackages = {"com.ian.practice"})
@MapperScan("com.ian.practice.db.mapper")
@ImportResource(locations = {"classpath:spring-dubbo.xml"})
@SpringBootApplication
public class PracticeDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeDubboApplication.class, args);
    }
}
