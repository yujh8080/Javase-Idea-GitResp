package com.sjxy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yujh
 * @Date: 2021/2/11 - 02 - 11 - 9:49
 * @Description: com.sjxy
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
public class EmpApplication {
    public static void main(String[] args) {

        SpringApplication.run(EmpApplication.class,args);
    }
}
