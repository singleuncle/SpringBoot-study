package com.uncle.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @program: SpringBoot-study
 * @description: 食物的配置类
 * @author: 步尔斯特
 * @create: 2021-03-01 17:21
 **/
@ConfigurationProperties(prefix = "food")
@Setter@Getter
public class FoodConfig {

    private String rice;
    private String meat;
    private String[] sauce;

}
