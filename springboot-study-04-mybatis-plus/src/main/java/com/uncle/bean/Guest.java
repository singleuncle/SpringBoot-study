package com.uncle.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾实体类
 * @author: 步尔斯特
 * @create: 2021-03-03 14:20
 **/
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    private Long id;
    private String name;
    private String role;
}
