package com.sjxy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yujh
 * @Date: 2021/2/10 - 02 - 10 - 19:08
 * @Description: com.sjxy
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("com.sjxy.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
