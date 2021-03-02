package com.uncle.bean;


import lombok.Getter;
import lombok.Setter;

/**
 * @program: SpringBoot-study
 * @description: 食物的实体类
 * @author: 步尔斯特
 * @create: 2021-03-01 16:40
 **/
@Setter@Getter
public class Food {
    private String rice;
    private String meat;
    private String[] sauce;
}
