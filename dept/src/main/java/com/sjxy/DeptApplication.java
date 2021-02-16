package com.sjxy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:20
 * @Description: com.sjxy
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
public class DeptApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptApplication.class,args);
    }
}
