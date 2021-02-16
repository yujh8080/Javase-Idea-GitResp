package com.sjxy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
<<<<<<< HEAD
import org.mybatis.spring.annotation.MapperScan;
=======
>>>>>>> fcee530d15d67f07d42de0055b6e4027942c6e97
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: yujh
<<<<<<< HEAD
 * @Date: 2021/2/10 - 02 - 10 - 19:08
=======
 * @Date: 2020/12/8 - 12 - 08 - 19:48
>>>>>>> fcee530d15d67f07d42de0055b6e4027942c6e97
 * @Description: com.sjxy
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
<<<<<<< HEAD
@MapperScan("com.sjxy.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
=======
public class ProviderApplication {
    public static void main(String[] args) {

>>>>>>> fcee530d15d67f07d42de0055b6e4027942c6e97
        SpringApplication.run(ProviderApplication.class,args);
    }
}
