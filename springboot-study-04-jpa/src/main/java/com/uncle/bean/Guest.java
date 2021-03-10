package com.uncle.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾实体类
 * @author: 步尔斯特
 * @create: 2021-03-03 14:20
 **/
@Entity
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;
}
