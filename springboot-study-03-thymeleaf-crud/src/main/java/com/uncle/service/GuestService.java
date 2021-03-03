package com.uncle.service;

import com.uncle.bean.Guest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringBoot-study
 * @description: 嘉宾业务层接口
 * @author: 步尔斯特
 * @create: 2021-03-03 14:24
 **/

public interface GuestService {

    List<Guest> list();

    void add(Guest guest);

    void update(Guest guest);

    Guest getName(String name);

    void delete(String name);
}
