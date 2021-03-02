package com.uncle;

import com.uncle.config.FoodConfig;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
/**
 * @program: SpringBoot-study
 * @description: 程序的主入口类
 * @author: 步尔斯特
 * @create: 2021-03-01 16:08
 **/
@SpringBootApplication
@EnableConfigurationProperties({FoodConfig.class})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
