package com.uncle.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾实体类
 * @author: 步尔斯特
 * @create: 2021-03-03 14:20
 **/

@Data@AllArgsConstructor@NoArgsConstructor
public class Guest {

    private String name;
    private String role;
}
