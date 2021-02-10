package com.sjxy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yujh
 * @Date: 2020/12/8 - 12 - 08 - 19:48
 * @Description: com.sjxy
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApplication {
    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class,args);
    }
}
